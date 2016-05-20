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
}
