Meta:

Narrative:
Jako Administrator
Chce dodac nowego pracownika
Abym mogl przypisywac mu incydenty

Scenario: Dodanie nowego pracownika
Given zalogowany administrator jest w zakladce uzytkownicy
When wybierze opcje dodaj pracownika
And wprowdzi nazwe, email i haslo
Then konto powinno zostac utworzone