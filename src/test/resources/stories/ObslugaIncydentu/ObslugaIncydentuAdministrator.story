Narrative:
Jako administrator
Chce miec dostep do formularza obslugi incydentow
Aby miec moc zarzadzac incydentami



Scenario1: administrator zmienia status incydentu z "niepotwierdzony" lub "rozwiazany"
Given formualarz obslugi incydentu posiada status,przypisanie incydentu, opis wykonanych prac
When administrator zmienia status incydentu
Then incydent posiada nowy status "zgloszony" lub "zamkniety"


Scenario2: administrator przypisuje incydent do pracownika lub innego administratora
Given formualarz obslugi incydentu posiada status,przypisanie incydentu, opis wykonanych prac
When administrator przypisuje incydent do pracownika lub innego administratora
Then w opisie incdentu pojawia sie nowy teskt