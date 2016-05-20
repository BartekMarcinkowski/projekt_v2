Narrative:
Jako pracownik
Chce miec dostep do szczegolow incydentow
Aby miec moc edytowac i sprawdzac incydenty



Scenario1: Pracownik edytuje opis incydentu
Given pracownik zalogowany wyswietla liste incydentow
When pracownik edytuje opis incydentu
Then w opisie incdentu pojawia sie nowy teskt


Scenario2: Pracownik dodaje plik do incydentu
Given poprawne logowanie uzytkownika i wyswietlenie listy plikow na stronie szczegolow
When pracownik dodaje plik do incydentu
Then nowy plik zostaje dodany do incydentu