Narrative:
Jako pracownik 
Chce miec dostep do formularza oblsugi incydentow
Aby moc oslugiwac incydenty



Scenario1: Pracownik zmienia status incydentu poprawnie
Given poprawne logowanie uzytkownika
When uzytkownik wprowadza poprawne dane do formularza
Then poprawne wyswietlenie przez system komunikatu

Scenario2: Pracownik zmienia status incydentu blednie
Given poprawne logowanie uzytkownika
When uzytkownik wprowadza niepoprawne dane do formularza
Then system wyswietla komunikat "Nie mozna utworzyc nowego rekordu"