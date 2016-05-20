Narrative:
Jako uzytkownik
Chce dodac nowy incydent
Aby moc zglaszac problem



Scenario: Uzytkownik dodaje nowy incydent poprawnie
Given poprawne logowanie uzytkownika
When kliknie przycisk utworz incydent
And poprawne wprowadzi wszystkie dane incydentu
Then incydent powinien zostac poprawnie dodany

Scenario: Uzytkownik dodaje nowy incydent blednie
Given poprawne logowanie uzytkownika
When kliknie przycisk utworz incydent
When nie wypelni wszystkich wymaganych pol danych incydentu
Then incydend powinien nie zostac utworzony