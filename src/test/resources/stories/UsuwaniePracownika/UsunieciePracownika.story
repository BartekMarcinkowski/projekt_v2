Meta:

Narrative:
Jako administrator
Chce usunac pracownika
Aby nie mial dostepu do incydentow

Scenario: Usuniecie pracownika z listy
Given zalogowany administrator jest w zakladce uzytkownicy
When wyszuka pracownika
And wybierze akcje delete
Then konto powinno zostac usuniete