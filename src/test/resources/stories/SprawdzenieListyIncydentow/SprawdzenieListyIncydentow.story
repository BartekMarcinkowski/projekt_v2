Narrative:
Jako uzytkownik
Chce miec dostep do listy incydentow
Aby sledzic zgloszone incydenty

Scenario: Brak zgloszonych incydentow
Given uzytkownik jest zalogowany do systemu
When sprawdza liste incydentow
Then system wyswietla komunikat o braku incydentow do wyswietlenia