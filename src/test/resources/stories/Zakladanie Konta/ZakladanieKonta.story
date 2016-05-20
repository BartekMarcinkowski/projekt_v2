Narrative:
Jako uzytkownik
Chce zalozyc nowe konto w systemie ICM
Abym mogl z niego kozystac

Scenario: Poprawne zalozenie nowego konta
Given uzytkownik ma otwarta strone rejstracji
When wprowadzi nazwe uzytkownika, email i haslo
Then uzytkownik powinien zostac zalogowany