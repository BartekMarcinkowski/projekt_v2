Narrative:
Jako administrator
Chce miec mozliwosc filtrowania uzytkownikow
Aby moc szybciej ich odnalesc

Scenario: Filtrowanie uzytkownikow po roli ROLE_USER
Given zalogowany administrator jest w zakladce uzytkownicy
When wybierze opcje filtruj
And wybierze role ROLE_USER
Then powinni zostac pokazani uzytkownicy z rola ROLE_USER