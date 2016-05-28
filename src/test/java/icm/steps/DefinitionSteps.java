package icm.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import icm.steps.serenity.EndUserSteps;


public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

/**Zakladanie konta*/

    @Given("uzytkownik ma otwarta strone rejstracji")
    public void otworzStroneRejstracji(){
        endUser.otworzStroneRejstracji();
    }

    @When("wprowadzi nazwe uzytkownika, email i haslo")
    public void zakladanieKonta(){
        endUser.wpiszNazweUzytkownika();
        endUser.wpiszEmail1();
        endUser.wpiszHaslo1();
        endUser.potwierdzHaslo1();
        endUser.wcisnijPrzyciskZarejstruj();
    }

    @Then("uzytkownik powinien zostac zalogowany")
    public void sprawdzenieCzyJestPrzyciskLogout(){
        endUser.assertPrzyciskLogout();
    }


/**Logowanie*/

    @Given("uzytkownik ma otwarta strone logowania")
    public void otworzStroneLogowania(){
        endUser.otworzStroneLogowania();
    }

    @When("poprawnie wprowadzi email i haslo")
    public void logowanie(){
        endUser.wpiszEmail();
        endUser.wpiszHaslo();
        endUser.wcisnijPrzyciskZalogujSie();
    }

    @Then("uzytkownik powinien zostac zalogowany na strone z lista incydentow")
    public void sprawdzenieCzyJestNapisIncydenty(){
        endUser.assertNapisIncydenty();
    }


/** Dodawanie nowego pracownika*/

    @Given("zalogowany administrator jest w zakladce uzytkownicy")
    public void zalogujJakoAdministrator() {
        endUser.otworzStroneLogowania();
        endUser.wpiszEmail();
        endUser.wpiszHaslo();
        endUser.wcisnijPrzyciskZalogujSie();
        endUser.wcisnijPrzyciskUzytkownicy();
    }

    @When("wybierze opcje dodaj pracownika")
    public void dodaniePracownika() {
        endUser.kliknijDodajPracownika();
    }

    @When("wprowdzi nazwe, email i haslo")
    public void wprowadzanieDanych() {
        endUser.wpiszNazwe();
        endUser.wprowadzEmail();
        endUser.wprowadzHaslo();
        endUser.potwierdzHaslo();
        endUser.wcisnijPrzyciskDodajPracownika();
    }

    @Then("konto powinno zostac utworzone")
    public void sprawdzenieCzyKontoUtworzone() {
        endUser.assertNapisKontoUtworzone();
    }

/**Filtrowanie incydentow*/

    @Given("pracownik jest zalogowany i znajduje sie w zakladce incydenty")
    public void zalogujJakoPracownik() {
        endUser.otworzStroneLogowaniaP();
        endUser.wpiszEmailP();
        endUser.wpiszHasloP();
        endUser.wcisnijPrzyciskZalogujSieP();
        endUser.assertNapisIncydenty();
    }

    @When("filtruje incydenty po statusie zgloszony")
    public void statusZgloszony() {
        endUser.kliknijFiltruj();
        endUser.wybierzZgloszony();
    }

    @Then("na liscie incydentow pozostaja incydenty ze statusem zgloszony")
    public void statusIncydentuZgloszony() {
        endUser.assertZgloszonyIncydent();
    }

/**Filtrowanie uzytkowników
 * Krok zdefiniowany wcześniej
 * @Given("zalogowany administrator jest w zakladce uzytkownicy")
   public void zalogujJakoAdministrator() {
       endUser.otworzStroneLogowania();
       endUser.wpiszEmail();
       endUser.wpiszHaslo();
       endUser.wcisnijPrzyciskZalogujSie();
       endUser.wcisnijPrzyciskUzytkownicy();
   }*/

    @When("wybierze opcje filtruj")
    public void filtrujPracownikow() {
        endUser.kliknijFilter();
    }

    @When("wybierze role ROLE_USER")
    public void wybierzRoleUser() {
        endUser.kliknijRoleUser();
    }

    @Then("powinni zostac pokazani uzytkownicy z rola ROLE_USER")
    public void sprawdzenieCzyRoleUser() {
        endUser.assertRoleUser();
    }

/**Dodanie nowego incydentu*/

    @Given("poprawne logowanie uzytkownika")
    public void logowanieUzytkownika() {
        endUser.otworzStroneLogowaniaU();
        endUser.wpiszEmailU();
        endUser.wpiszHasloU();
        endUser.wcisnijPrzyciskZalogujSie();
    }

    @When("kliknie przycisk utworz incydent")
    public void przyciskUtworzIncydent() {
        endUser.kliknijPrzyciskUtworzIncydent();
    }

    @When("poprawne wprowadzi wszystkie dane incydentu")
    public void daneIncydentu() {
        endUser.typIncydentu();
        endUser.opisIncydentu();
        endUser.adresIncydentu();
        endUser.kodMiastoIncydentu();
        endUser.kliknijUtworzI();
    }

    @Then("incydent powinien zostac poprawnie dodany")
    public void incydentUtworzony() {
        endUser.assertIncydentUtworzony();
    }

    @When("nie wypelni wszystkich wymaganych pol danych incydentu")
    public void niepelneDaneIncydentu() {
        endUser.typIncydentu();
        endUser.opisIncydentu();
        endUser.kliknijUtworzI();
    }

    @Then("incydend powinien nie zostac utworzony")
    public void incydentNieUtworzony() {
        endUser.assertIncydentNieUtworzony();
    }

/**Sprawdzenie listy incydentow*/

    @Given("uzytkownik, ktory nie zglosil zadnego incydentu jest zalogowany do systemu")
    public void logowanieUzytkownika3() {
        endUser.otworzStroneLogowaniaU();
        endUser.wpiszEmailU3();
        endUser.wpiszHasloU3();
        endUser.wcisnijPrzyciskZalogujSie();
    }

    @When("sprawdza liste incydentow")
    public void wyswietlenieListyIncedentow() {
        endUser.assertNapisIncydenty();
    }

    @Then("system wyswietla komunikat o braku incydentow do wyswietlenia")
    public void pustaListaIncydentow() {
        endUser.pustaListaIncydentow();
    }

/**Statystyki*/

    @Given("zalogowany administrator")
    public void zalogujAdministratora() {
        endUser.otworzStroneLogowania();
        endUser.wpiszEmail();
        endUser.wpiszHaslo();
        endUser.wcisnijPrzyciskZalogujSie();
    }

    @When("wybierze zakladke dashboard")
    public void wybierzDashboard() {
        endUser.wybierzDashboard();
    }

    @Then("powinien widziec statystyki incydentow")
    public void statystykiIncydentow() {
        endUser.statystykiIncydentow();
    }

/**Usuwanie pracownika*/
/**Krok zdefiniowany wcześniej*/
/** @Given("zalogowany administrator jest w zakladce uzytkownicy")
    public void zalogujJakoAdministrator() {
        endUser.otworzStroneLogowania();
        endUser.wpiszEmail();
        endUser.wpiszHaslo();
        endUser.wcisnijPrzyciskZalogujSie();
        endUser.wcisnijPrzyciskUzytkownicy();
    }*/

    @When("wyszuka pracownika")
    public void wybieraPracownika() {
        endUser.wybieraPracownika();
    }

    @When("wybierze akcje delete")
    public void wybierzDelete() {
        endUser.kliknijAkcja();
        endUser.kliknijDelete();
    }

    @Then("konto powinno zostac usuniete")
    public void kontoUsunieta() {
        endUser.komunikatKontoUsuniete();
        endUser.brakKontaNaLiscie();
    }

/**Wyszukiwanie incydentow po identyfikatorze*/

    @Given("uzytkownik jest zalogowany i znajduje sie w zakladce incydenty")
    public void zalogowanyUzytkownik() {
        endUser.otworzStroneLogowaniaU();
        endUser.wpiszEmailU();
        endUser.wpiszHasloU();
        endUser.wcisnijPrzyciskZalogujSie();
        endUser.assertNapisIncydenty();
    }

    @When("uzytkownik wprowadza identyfikator istniejacego incydentu")
    public void wyszukanieIncydentuId1() {
        endUser.wyszukanieIncydentuId1();
    }

    @Then("sytsem wyswietla strone zawierajaca szczegoly incydentu")
    public void szczegolyIncydentuId1() {
        endUser.szczegolyIncydentuId1();
    }

 /**@Given("uzytkownik jest zalogowany i znajduje sie w zakladce incydenty")
    public void zalogowanyUzytkownik() {
        endUser.otworzStroneLogowaniaU();
        endUser.wpiszEmailU();
        endUser.wpiszHasloU();
        endUser.wcisnijPrzyciskZalogujSie();
        endUser.assertNapisIncydenty();
    }
    */

    @When("uzytkownik wprowadza identyfikator nieistniejacego incydentu")
    public void wyszukanieIncydentuId21() {
        endUser.wyszukanieIncydentuId21();
    }

    @Then("system wyswietla komunikat: Nie znaleziono incydentu")
    public void komunikatNieZnalezionoIncydentu() {
        endUser.komunikatNieZnalezionoIncydentu();
    }

/**Szczegoly incydentu - pracownik*/

 /**@Given("pracownik jest zalogowany i znajduje sie w zakladce incydenty")
    public void zalogujJakoPracownik() {
        endUser.otworzStroneLogowaniaP();
        endUser.wpiszEmailP();
        endUser.wpiszHasloP();
        endUser.wcisnijPrzyciskZalogujSieP();
        endUser.assertNapisIncydenty();
    }
    */

    @When("pracownik wyswietli szczegoly incydentu")
    public void szczegolyIncydentu() {
        endUser.wybierzeAkcja();
        endUser.wybierzeSzczegolyIncydentu();
    }

    @When("edytuje opis incydentu")
    public void edytujeOpisIncydentu() {
        endUser.kliknijOpisIncydentu();
        endUser.wprowadziNowyOpis();
    }

    @Then("w opisie incdentu pojawia sie nowy teskt")
    public void sprawdzNowyOpisIncydentu() {
        endUser.wybierzIncydenty();
        endUser.wybierzeAkcja();
        endUser.wybierzeSzczegolyIncydentu();
        endUser.kliknijOpisIncydentu();
        endUser.sprawdzNowyOpis();
    }

    @Given("pracownik wyswietli szczegoly incydentu")
    public void wyswietliSzczegolyIncydentu() {
        endUser.wybierzeAkcja();
        endUser.wybierzeSzczegolyIncydentu();
    }

    @When("w sekcji pliki wybierze plik do dodania i kliknie upload")
    public void dodaniePliku() throws Exception {
        endUser.kliknijPrzegladaj();
        endUser.wyszukaniePliku();
        endUser.kliknijUpload();
    }

    @Then("nowy plik powinien zostac dodany do incydentu")
    public void plikDodanyDoSzczegolow() {
        endUser.plikDodany();
    }

/**Szczegóły incydentu - użytkownik*/

    @Given("uzytkownik wyswietli szczegoly incydentu")
    public void uzytkownikWyswietlaSzczegoly() {
        endUser.kliknieAkcja();
        endUser.kliknieSzczegoly();
    }

    @When("uzytkownik edytuje opis incydentu")
    public void uzytkownikEdytujeOpisIncydentu() {
        endUser.kliknijOpisIncydentu();
        endUser.wprodzaNowyOpis();
    }

    @Then("w opisie incydentu pojawia sie nowy teskt")
    public void nowyOpisIncydentu() {
        endUser.wybierzIncydenty();
        endUser.kliknieAkcja();
        endUser.kliknieSzczegoly();
        endUser.kliknijOpisIncydentu();
        endUser.nowyOpis();
    }

    @Then("plik powinien zostac dodany do incydentu")
    public void nowyPlikDodany() {
        endUser.nowyPlikDodany();
    }

/**Obsługa incydentu - administrator*/

    @Given("zalogowany administrator jest w zakladce incydenty")
    public void zalogujAdministrator() {
        endUser.otworzStroneLogowania();
        endUser.wpiszEmail();
        endUser.wpiszHaslo();
        endUser.wcisnijPrzyciskZalogujSie();
        endUser.assertNapisIncydenty();
    }

    @When("wybierze wybierze akcje dodaj audyt incydentu w statusie niepotwierdzony")
    public void dodanieAudytuNiepotwierdzony() {
        endUser.wyborIncydentu();
        endUser.wybierzDodajAudyt();
    }

    @When("w formularzu audytu zmieni status na zgloszony")
    public void zmianaStatusu() throws InterruptedException {
        endUser.rozwijanieListyStatusow();
        endUser.klikniecieDodajAudyt();
    }

    @Then("status incydentu powinien zostac zmieniny")
    public void statusZmieniony() {
        endUser.komunikatAudytDodany();
    }

    @When("wybierze wybierze akcje dodaj audyt incydentu")
    public void dodanieAdytuZgloszony() {
        endUser.wybranieAkcja();
        endUser.wybierzDodajAudyt();
    }

    @When("w formularzu audytu przypisze incydent do pracownika")
    public void przypisanieIncydentuDoPracownika() {
        endUser.wybraniePracownika();
        endUser.klikniecieDodajAudyt();
    }

    @Then("incydent powinien zostac przypisany do pracownika")
    public void incydentPrzypisany() {
        endUser.incydentPrzypisany();
    }
}
