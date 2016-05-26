package icm.steps.serenity;

import icm.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class EndUserSteps extends ScenarioSteps {

    StronaLogowania stronaLogowania;
    Incydenty incydenty;
    StronaRejstracji stronaRejstracji;
    ListaKont listaKont;
    DodawaniePracownika dodawaniePracownika;
    NoweIncydenty noweIncydenty;
    StronaLogowaniaP stronaLogowaniaP;
    ListaKontRoleUser listaKontRoleUser;
    StronaLogowaniaU stronaLogowaniaU;
    NowyIncydent nowyIncydent;
    SprawdzanieListyIncydentow sprawdzanieListyIncydentow;
    WyszukiwanieIncydentowPoIdentyfikatorze wyszukiwanieIncydentowPoIdentyfikatorze;

    /**
     * Zakladanie konta
     */

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

    /**
     * Logowanie
     */

    @Step
    public void otworzStroneLogowania() {
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


    /**
     * Dodawanie nowego pracownika
     */

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


    /**
     * Filtrowanie incydentow
     */

    @Step
    public void otworzStroneLogowaniaP() {
        stronaLogowaniaP.open();
        getDriver().navigate().refresh();
    }

    @Step
    public void wpiszEmailP() {
        stronaLogowaniaP.wpiszEmailP();
    }

    @Step
    public void wpiszHasloP() {
        stronaLogowaniaP.wpiszHasloP();
    }

    @Step
    public void wcisnijPrzyciskZalogujSieP() {
        stronaLogowaniaP.wcisnijPrzyciskZalogujSieP();
    }

    @Step
    public void kliknijFiltruj() {
        incydenty.kliknijFiltruj();
    }

    @Step
    public void wybierzZgloszony() {
        incydenty.kliknijZgloszony();
    }

    @Step
    public void assertZgloszonyIncydent() {
        noweIncydenty.assertZgloszonyIncydent();
    }

    /**
     * Filtrowanie pracownikow
     */

    @Step
    public void kliknijFilter() {
        listaKont.kliknijFilter();
    }

    @Step
    public void kliknijRoleUser() {
        listaKont.kliknijRoleUser();
    }

    @Step
    public void assertRoleUser() {
        listaKontRoleUser.assertRoleUser();
    }

    /**
     * Dodanie nowego incydentu
     */

    @Step
    public void otworzStroneLogowaniaU() {
        stronaLogowaniaU.open();
        getDriver().navigate().refresh();
    }

    @Step
    public void wpiszEmailU() {
        stronaLogowaniaU.wpiszEmailU();
    }

    @Step
    public void wpiszHasloU() {
        stronaLogowaniaU.wpiszHasloU();
    }

    @Step
    public void kliknijPrzyciskUtworzIncydent() {
        incydenty.kliknijUtworzIncydent();
    }

    @Step
    public void typIncydentu() {
        nowyIncydent.wpiszTypIncydentu();
    }

    @Step
    public void opisIncydentu() {
        nowyIncydent.wpiszOpisIncydentu();
    }

    @Step
    public void adresIncydentu() {
        nowyIncydent.wpiszAdresIncydentu();
    }

    @Step
    public void kodMiastoIncydentu() {
        nowyIncydent.kodMiastoIncydentu();
    }

    @Step
    public void kliknijUtworzI() {
        nowyIncydent.kliknijUtworzI();
    }

    @Step
    public void assertIncydentUtworzony() {
        incydenty.assertIncydentUtworzony();
    }

    @Step
    public void assertIncydentNieUtworzony() {
        nowyIncydent.assertIncydentNieUtworzony();
    }


    /**
     * Sprawdzanie listy incydentow
     */

    @Step
    public void otworzStroneLogowania2() {
        stronaLogowania.open();
        getDriver().navigate().refresh();
    }

    @Step
    public void wpiszEmail2() {
        sprawdzanieListyIncydentow.wpiszEmail();
    }

    @Step
    public void wpiszHaslo2() {
        sprawdzanieListyIncydentow.wpiszHaslo();
    }

    @Step
    public void wcisnijPrzyciskZalogujSie2() {
        sprawdzanieListyIncydentow.wcisnijPrzyciskZalogujSie();
    }

    @Step
    public void assertNapisIncydenty2() {
        incydenty.assertNapisIncydenty();
    }

    @Step
    public void assertNieZnalezionoRekordow() {sprawdzanieListyIncydentow.assertNieZnalezionoRekordow();}


    /**
     * Wyszukiwanie incydentow po identyfikatorze
     */

    @Step
    public void otworzStroneLogowania3() {
        stronaLogowaniaU.open();
        getDriver().navigate().refresh();
    }

    @Step
    public void wpiszEmail3() {
        stronaLogowaniaU.wpiszEmailU();
    }

    @Step
    public void wpiszHaslo3() {
        stronaLogowaniaU.wpiszHasloU();
    }

    @Step
    public void assertNieZnalezionoRekordow2() {wyszukiwanieIncydentowPoIdentyfikatorze.assertNieZnalezionoRekordow2();}

    @Step
    public void wpiszIDIncydentu() { wyszukiwanieIncydentowPoIdentyfikatorze.wpiszIDIncydentu(); }

    @Step
    public void kliknijSzukaj() { wyszukiwanieIncydentowPoIdentyfikatorze.kliknijSzukaj(); }

    @Step
    public void assert2() { wyszukiwanieIncydentowPoIdentyfikatorze.assert2(); }

}