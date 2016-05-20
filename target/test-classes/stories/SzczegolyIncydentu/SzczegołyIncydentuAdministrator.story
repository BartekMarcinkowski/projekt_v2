Narrative:
Jako administrator
Chce miec dostep do szczegolow incydentu
Aby zarzadzac incydentami


Scenario1: Administrator edytuje opis incydentu
Given poprawne zalogowanie administratora 
AND wyswietlenie listy incydentow
When administrator edytuje opis incydentu
Then w opisie incdentu pojawia sie nowy teskt

Scenario2: Administrator dodaje plik do incydentu
Given poprawne zalogowanie administratora 
AND wyswietlenie listy incydentow
When dodanie pliku do incydentu 
Then nowy plik zostaje dodany do incydentu