Narrative:
Jako uzytkownik
Chce wyszukac incydent o danym identyfikatorze
Aby odnalezc konkretny incydent

Scenario1: Incydent o danym identyfikatorze istnieje
Given uzytkownik jest zalogowany do konta and lista incydentow zawiera incydenty
When uzytkownik wprowadza istniejacy identyfikator incydentu
Then sytsem wyswietla strone zawierajaca szczegoly incydentu

Scenario2: Incydent o danym identyfikatorze nie istnieje
Given uzytkownik jest zalogowany do konta
When uzytkownik wprowadza nieistniejacy identyfikator incydentu
Then system wyswietla komunikat "Nie znaleziono incydentu"