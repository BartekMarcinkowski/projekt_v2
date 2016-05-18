package icm.steps.serenity;

import icm.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    StronaLogowania stronaLogowania;
    Incydenty incydenty;
    StronaRejstracji stronaRejstracji;
    ListaKont listaKont;
    DodawaniePracownika dodawaniePracownika;

/**Logowanie*/

    @Step
    public void otworzStroneLogowania(){
        stronaLogowania.open();
        getDriver().navigate().refresh();
    }

    @Step
    public void wpiszEmail() {
        stronaLogowania.wpiszEmail();
    }
    @Step
    public void wpiszHaslo() {
        stronaLogowania.wpiszHaslo();
    }
    @Step
    public void wcisnijPrzyciskZalogujSie() {
        stronaLogowania.wcisnijPrzyciskZalogujSie();
    }

    @Step
    public void assertNapisIncydenty() {
        incydenty.assertNapisIncydenty();
    }

/**Zakladanie konta*/

    @Step
    public void otworzStroneRejstracji() {
        stronaRejstracji.open();
        getDriver().navigate().refresh();
    }

    @Step
    public void wpiszNazweUzytkownika() {
        stronaRejstracji.wpiszNazweUzytkownika();
    }

    @Step
    public void wpiszEmail1() {
        stronaRejstracji.wpiszEmail1();
    }

    @Step
    public void wpiszHaslo1() {
        stronaRejstracji.wpiszHaslo1();
    }

    @Step
    public void potwierdzHaslo1() {
        stronaRejstracji.potwierdzHaslo1();
    }

    @Step
    public void wcisnijPrzyciskZarejstruj() {
        stronaRejstracji.wcisnijPrzyciskZarejstruj();
    }

    @Step
    public void assertPrzyciskLogout() {
        incydenty.assertPrzyciskLogout();
    }

/** Dodawanie nowego pracownika*/

    @Step
    public void wcisnijPrzyciskUzytkownicy() {
        incydenty.wcisnijPrzyciskUzytkownicy();
    }

    @Step
    public void kliknijDodajPracownika() {
        listaKont.kliknijDodajPracownika();
    }

    @Step
    public void wpiszNazwe() {
        dodawaniePracownika.wpiszNazwe();
    }

    @Step
    public void wprowadzEmail() {
        dodawaniePracownika.wprowadzEmail();
    }

    @Step
    public void wprowadzHaslo() {
        dodawaniePracownika.wprowadzHaslo();
    }

    @Step
    public void potwierdzHaslo() {
        dodawaniePracownika.potwrdzHaslo();
    }

    @Step
    public void wcisnijPrzyciskDodajPracownika() {
        dodawaniePracownika.wcisnijPrzyciskDodajPracownika();
    }

    @Step
    public void assertNapisKontoUtworzone() {
        listaKont.assertNapisKontoUtworzone();
    }

}