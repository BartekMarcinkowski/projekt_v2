Narrative:
Jako pracownik/administrator
Chce filtrowac incydenty po statusie
Aby moc zarzadzac incydentami

Scenario: Filtrowanie incydentow po statusie "zgloszony"
Given pracownik/administrator jest zalogowany do swojego konta and lista incydentow zawiera incydenty
When filtruje incydenty po statusie "zgloszony"
Then na liscie incydentow pozostaja incydenty ze statusem "zgloszony"