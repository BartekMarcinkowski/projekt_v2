Narrative:
Jako uzytkownik
Chce miec dostep do incydentow
Aby miec moc edytowac opis incydentu


Scenario: Uzytkownik edytuje opis incydentu
Given uzytkownik jest zalogowany i znajduje sie w zakladce incydenty
And uzytkownik wyswietli szczegoly incydentu
When uzytkownik edytuje opis incydentu
Then w opisie incydentu pojawia sie nowy teskt


Scenario: uzytkownik dodaje plik do incydentu
Given uzytkownik jest zalogowany i znajduje sie w zakladce incydenty
And uzytkownik wyswietli szczegoly incydentu
When w sekcji pliki wybierze plik do dodania i kliknie upload
Then plik powinien zostac dodany do incydentu