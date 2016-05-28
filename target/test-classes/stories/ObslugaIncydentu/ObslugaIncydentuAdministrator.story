Narrative:
Jako administrator
Chce miec dostep do formularza obslugi incydentow
Aby miec moc zarzadzac incydentami



Scenario: administrator zmienia status incydentu z niepotwierdzony na zgłoszony
Given zalogowany administrator jest w zakladce incydenty
When wybierze wybierze akcje dodaj audyt incydentu w statusie niepotwierdzony
And w formularzu audytu zmieni status na zgloszony
Then status incydentu powinien zostac zmieniny


Scenario: administrator przypisuje incydent do pracownika
Given zalogowany administrator jest w zakladce incydenty
When wybierze wybierze akcje dodaj audyt incydentu
And w formularzu audytu przypisze incydent do pracownika
Then incydent powinien zostac przypisany do pracownika