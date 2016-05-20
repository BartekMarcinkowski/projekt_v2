Narrative:
Jako pracownik
Chce filtrowac incydenty po statusie
Aby moc zarzadzac incydentami

Scenario: Filtrowanie incydentow po statusie "zgloszony"
Given pracownik jest zalogowany i znajduje sie w zakladce incydenty
When filtruje incydenty po statusie zgloszony
Then na liscie incydentow pozostaja incydenty ze statusem zgloszony