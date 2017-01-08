Projekt wykonywany w ramach pracy dyplomowej na temat: "Projekt i wykonanie automatycznych testów funkcjonalnych wg filozofii BDD za pomocą jBehave i Selenium".
Projekt maven stworzony w programie IntelliJ IDEA, wykorzystuje Serenity, jBehave, Selenium.
Jest to projekt testów automatycznych aplikacji ICM.
Na podstawie dokumentacji stworzono 15 historyjek i 22 scenariusze, z których zautomatyzowane zostało 18.
Historyjki i scenariusze znajduja się w katalogu  src / test / resources / stories /. Są pogrupowane według funkcjonalności.
Pliki z napisanymi testami w języku JAVA znajdują się w katalogu  src / test / java / icm /.
Projekt po ściągnięciu i zimportowaniu w IntelliJ powinien wykonywać utworzone testy.
Raport z wykonanych testów znajduje się w katalogu  target / site / serenity /.Należy uruchomić w przeglądarce plik intex.html.

Uruchomienie projektu:
1. Download ZIP
2. Rozpakować pobrany plik
3. Pliki icm.txt i DodawaniePLiku.exe przenieść bezpośrednio na dysk C:\ (konieczne do wykonania testu dodawania załącznika do incydentu)
4. Uruchomić IntelliJ (lub inne IDE)
5. Wybrać plik -> otwórz
6. Wybrać rozpakowany katalog z projektem
7. W aplikacji ICM będąc zalogowanym na konto administratora utworzyć konto pracownika: "jas", "jas@wp.pl" (potrzebne do wykonania testu usuwania konta)
8. Testy uruchamia się z pliku AcceptanceTestSuite.java

Testy wykonywane są na aplikacji demo ICM, wersji 1.1.
Aplikacja oraz instrukcja jej uruchomienia: https://github.com/kolorobot/spring-mvc-icm-demo/wiki/Uruchomienie-aplikacji
