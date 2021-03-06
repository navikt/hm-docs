
Oppgavelister i Gosys blir fort fulle når man tester mye. 
Da kan det være nyttig å rydde litt. Det kan gjøres via oppgaveapiet.


### Golang script:

```shell
❯ go run gosys-clean.go --help
Usage of gosys-clean:
  -aktoerId string
    	Overstyr FNR-tabellen og brukt denne aktør iden i stede
  -fnr string
    	Personnummer for brukeren du vil ferdigstille oppgaver for (hvis man setter aktoerID ignoreres dette feltet) (default "15084300133")
  -limit int
    	Maks antall oppgaver vi ferdigstiller (sortert ASC) (default 320)
  -pw string
    	Service-bruker passord, brukt for å generere STS token
  -user string
    	Service bruker brukernavn, brukt for å generere STS token (default "srv-digihot")
```

```shell
❯ go run gosys-clean.go --pw "<passordet du finner i Secret Manager (dev) for hm-soknad-api-secret>"
Ferdigstiller alle oppgaver for aktørId=2816991252958:
- Genererer STS token for srv-digihot
- Henter ut listen over alle oppgaver fra Gosys
- Ferdigstiller 1 oppgaver
Ferdig!
```

### Manuelt:

1. Generer token via sts (bruk for eksempel srv-digihotproxy brukeren)
    https://security-token-service.dev.adeo.no/swagger-ui/index.html?configUrl=/api/api-doc/swagger-config#/System%20OIDC%20Token/postOIDCToken
2. Hent ut åpne oppgaver oppgaver for en gitt bruker. APIet krever aktørid. Den kan hentes fra PDL APIet. 
    For 15084300133 er akørid: 2816991252958

    `curl -X GET "https://oppgave.dev.intern.nav.no/api/v1/oppgaver?statuskategori=AAPEN&tema=HJE&aktoerId=2816991252958&sorteringsrekkefolge=ASC&sorteringsfelt=ENDRET_TIDSPUNKT&limit=320" -H "accept: application/json" -H "X-Correlation-ID: hje-zzzppp" -H "Authorization: Bearer $TOKEN" > tmp/oppgaver.json`

3. Kjør `node oppgaver.js` for å genere en liste med oppgaveid og versjon som igjen brukes til å oppdatere oppgave apiet. 
4. Lag en payload på dette formatet 

    ```
    {
        "status": "FERDIGSTILT",
        "oppgaver": [
            { "id": 71132, "versjon": 4 },
            { "id": 72277, "versjon": 4 }
        ]
    }
    ```

    Listen med oppgaver er output fra oppgaver.js

    Denne payloaden kan igjen brukes for å gjøre et PATCH kall til oppgave. 

5. curl -X PATCH "https://oppgave.dev.intern.nav.no/api/v1/oppgaver" -H  "accept: application/json" -H  "X-Correlation-ID: 1234" -H  "Authorization: Bearer $TOKEN" -H  "Content-Type: application/json" -d "{\"status\":\"FERDIGSTILT\",\"oppgaver\":[{\"id\":71132,\"versjon\":4},{\"id\":72277,\"versjon\":4}]}"

6. Profit

Dette kan sys sammen til en helautomatisk prosess hvis noen har tid og lyst til å iterere videre på dette. 




