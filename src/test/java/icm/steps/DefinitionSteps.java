package icm.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import icm.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

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

}
