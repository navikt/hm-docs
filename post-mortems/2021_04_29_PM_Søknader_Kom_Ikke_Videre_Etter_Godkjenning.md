## Oppsummering av hendelse

Vi, i team digihot, fekk melding frå ein hjelpemiddelformidlar den 29.04 om at ein hjelpemiddelsøknad ho hadde sendt inn
på vegne av brukar gjennom vår nye søknadsløysing ikkje hadde komme fram til hjelpemiddelsentralen. Søknaden tok i bruk
ny funksjonalitet der brukar hadde godkjent søknaden sjølv på nav.no, og den stod som godkjent i databasen, men det vart
aldri oppretta oppgave i gosys og vidare i infotrygd og OEBS som skal skje etter at brukar har godkjent innsending av
søknad. Vi fant så ut at dette var tilfelle for totalt tre søknader som vart oppretta mellom 9. og 12. april.
Innsenderane i tre kommunar vart kontakta og dei beslutta å sende inn søknadene på nytt.

## Rotårsak til feilen

Databaseendring der nytt felt vart innført på søknaden førte til feil ved videresending av søknader som var oppretta før
databaseendringa vart rulla ut. Videresending feila med NPE fordi databaseendringa mangla bakoverkompatibilitet. Appen (
ein river i Rapids & Rivers arkitektur) forsøkte videresending på nytt etter feil, men fordi oppdatert status var commita til
databasen så vart søknaden tolka som allerede videresendt og derfor vart den hoppa over i videre behandling.

## Læring

Huske at vi til einkvar tid kan ha søknader ute til godkjenning (aktive i 3 veker) og passe på at endringar er
bakoverkompatible med slike søknader. Vi har ingen god metode for å fange opp denne type feil, må lage noko for det.
Passe på at commits til database som påvirkar retries plasseres på trygg plass eller i transaksjon.

## Hva gjorde vi bra

Fant raskt ut av feil og omfang gjennom samarbeide i zoom-rom. Raske til å kontakte berørte.

## Hva gjorde vi dårlig

## Hvordan hindrer vi at noe lignende skjer igjen? (tiltak)

Snakke om feilen i teamet, og om bakoverkompatibilitet og gotchas rundt retries 
Lage app for å overvåke flyt i systemet som varsler dersom søknader stoppar opp (edited)
