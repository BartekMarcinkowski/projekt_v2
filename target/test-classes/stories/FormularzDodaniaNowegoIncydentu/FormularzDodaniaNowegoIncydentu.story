Narrative:
Jako uzytkownik
Chce dodac nowy incydent
Aby moc zglaszac problem



Scenario1: Uzytkownik dodaje nowy incydent poprawnie 
Given poprawne logowanie uzytkownika
When poprawne wprowadzenie wszystkich danych incydentu
Then poprawne dodanie nowego incydentu


Scenario2: Uzytkownik dodaje nowy incydent blednie
Given poprawne logowanie uzytkownika
When niepoprawne wprowadzenie wszystkich danych incydentu
Then brak mozliwosci utworzenia nowego incydentu