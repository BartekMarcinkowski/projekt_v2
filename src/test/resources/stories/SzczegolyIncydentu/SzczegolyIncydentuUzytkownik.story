Narrative:
Jako uzytkownik
Chce miec dostep do incydentow
Aby miec moc edytowac opis incydentu


Scenario1: Edytowanie opisu incydentu
Given uzytkownik zalogowany do konta 
AND lista incydentow zawiera incydenty i je  wyswietla
When uzytkownik edytuje opis incydentu
Then w opisie incydentu pojawia sie nowy teskt


Scenario2: uzytkownik dodaje plik do incydentu
Given lista plikow znajduje sie na stronie szczegolow
When uzytkownik dodaje plik do incydentu
Then nowy plik zostaje dodany do incydentu