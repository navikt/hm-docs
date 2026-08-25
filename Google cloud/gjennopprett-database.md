### Gjenoppretting fra backup
* Ta ned appen / sørg for at den er nede
    * Kan gjøres ved å sette replicas til 0 i nais-fil
* Velg om det er dev eller prod som skal gjenopprettes ved å velge project teamdigihot-dev eller teamdigihot-prod i headeren i [Google Cloud Console](https://console.cloud.google.com)
* gå inn på instans av applikasjonen ved å navigere til Databases -> Cloud SQL i menyen øverst til venstre
* gå på “backup” (meny til venstre)
* trykk “restore” på ønsket backup
    * Valg av restore alternativ er avhengig av behov. Tryggeste er å velge "Restore to a new instance" og velge europe-north-1 (Finland)
    * Fra ny instans kan man eksportere data og importere/migrere tapt data til den gjeldende instansen eller man kan kan konfigurere applikasjonen til å koble seg til den nye databaseinstansen med 


### Gjennoppretting med pg_dump og ny databaseinstans
Hvis man vil gjøre en hard reset og bruke pg_dump (da har man mer kontroll) kan man følge denne oppskriften: https://nav-it.slack.com/archives/C09CHA215S5/p1761295244591559?thread_ts=1761206153.669609&cid=C09CHA215S5

I korte trekk oppretter man en kopi av applikasjonen slik at man får en ny(tom) databaseinstans som er helt lik. Deretter kan man bruke pg_dump for å få en fil man potensielt kan tweake på ved behov, for så å laste opp filen igjen, tilsvarene pg_restore. Deretter sletter man begge appene (ikke databaseinstansene) og deployer originalappen med config som får den til å peke på ny instans. 

* Opprett kopi av applikasjon.
    * https://docs.nais.io/build/how-to/build-and-deploy/
        * Opprett repo i github
        * Opprett repo i nais konsoll
        * Klon ned repo lokalt og kopier minst disse fra originalrepo
            * .github
            * .nais
                * Viktig at database heter det samme som i original-applikasjon
            * Dockerfile
            * pom.xml
            * .gitignore for mindre støy
* push til git - dette gjør at applikasjonen deployes og ny databaseinstans blir laget

* kopier data fra gammel instans til ny instans, enten med
    * restore - fra en database-backup
    * trykk export som SQL (dette tilsvarer pg_dump)
        * velg North-1 som region
        * resten av valgene kan være default
        * legg inn i en bucket, der kan man laste ned pg_dumpen hvis ønskelig
* Siden rollen i databasen ofte heter det samme som databaseinstansen kan det være lurt å sjekke om rollen burde endres manuelt i filen før man laster opp til ny instans
* laste opp pg_dump og gjenopprette databasen
    * gå til instansen du vil gjenopprette under Databases -> Cloud SQL i Google Cloud Console
    * Trykk “Import”
        * Vil kræsje hvis databasen ligger der fra før, så gammel database må potensielt slettes (dette skal ikke være tilfelle hvis man har laget applikasjonen fra bånn av)
        * Hvis slettet så lag ny database med samme navn før man importerer data
    * Velg pg-dumpen (enten fra bucket fra forrige steg eller lokalt. Hvis lokalt blir man bedt om å laste opp i en bucket)
    * Velg databasen (IKKE postgres) som destinasjon
    * Velg bruker (heter som regel det samme som databasen)
* Kjør kubectl delete app <app-navn> og kubectl delete app <temp-app navn>. Dette skal rydde opp alt.
    * VIKTIG OBS OBS! Dobbeltsjekk at appen ikke har satt gcp.sqlInstances[].cascadingDelete = true . Det vil slette databaseinstansene i tillegg til appen og man mister potensielt all data
    * Dette sletter applikasjonene, men databaseinstansene lever fortsatt
    * Får nye client-ids og secrets når man kjører opp igjen, så alle applikasjoner som snakker med originalapplikasjonen må redeployes 
* Bytt til ny database-instans i nais-fil i original-applikasjon
    * gcp -> sqlInstances -> name
* Deploy original-applikasjon
