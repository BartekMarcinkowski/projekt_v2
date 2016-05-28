Narrative:
Jako pracownik
Chce miec dostep do szczegolow incydentow
Aby miec moc edytowac i sprawdzac incydenty



Scenario: Pracownik edytuje opis incydentu
Given pracownik jest zalogowany i znajduje sie w zakladce incydenty
When pracownik wyswietli szczegoly incydentu
And edytuje opis incydentu
Then w opisie incdentu pojawia sie nowy teskt


Scenario: Pracownik dodaje plik do incydentu
Given pracownik jest zalogowany i znajduje sie w zakladce incydenty
And pracownik wyswietli szczegoly incydentu
When w sekcji pliki wybierze plik do dodania i kliknie upload
Then nowy plik powinien zostac dodany do incydentu