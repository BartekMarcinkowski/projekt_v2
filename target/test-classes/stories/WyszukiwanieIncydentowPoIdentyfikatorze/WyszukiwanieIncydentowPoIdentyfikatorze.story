Narrative:
Jako uzytkownik
Chce wyszukac incydent o danym identyfikatorze
Aby odnalezc konkretny incydent

Scenario: Wyszukiwanie istniejacego incydentu
Given uzytkownik jest zalogowany i znajduje sie w zakladce incydenty
When uzytkownik wprowadza identyfikator istniejacego incydentu
Then sytsem wyswietla strone zawierajaca szczegoly incydentu

Scenario: Wyszukiwanie nieistniejacego incydentu
Given uzytkownik jest zalogowany i znajduje sie w zakladce incydenty
When uzytkownik wprowadza identyfikator nieistniejacego incydentu
Then system wyswietla komunikat: Nie znaleziono incydentu