Narrative:
Jako uzytkownik
Chce miec dostep do listy incydentow
Aby sledzic zgloszone incydenty

Scenario: Brak zgloszonych incydentow dla zalogowanego uzytkownika
Given uzytkownik, ktory nie zglosil zadnego incydentu jest zalogowany do systemu
When sprawdza liste incydentow
Then system wyswietla komunikat o braku incydentow do wyswietlenia