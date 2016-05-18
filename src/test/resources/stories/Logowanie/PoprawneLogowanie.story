Meta:

Narrative:
Jako uzytkownik
Chce sie zalogowac do ICM
Aby miec dostep do incydentow

Scenario: Poprawne logowanie do systemu ICM
Given uzytkownik ma otwarta strone logowania
When poprawnie wprowadzi email i haslo
Then uzytkownik powinien zostac zalogowany na strone z lista incydentow