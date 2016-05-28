package icm.steps.serenity;

import com.sun.deploy.security.URLClassPathControl;
import com.thoughtworks.selenium.webdriven.commands.Type;
import icm.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.components.FileToUpload;
import net.thucydides.core.steps.ScenarioSteps;
import org.hibernate.validator.constraints.URL;
import org.openqa.selenium.support.FindBy;
import sun.awt.im.InputContext;

import javax.lang.model.element.Element;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.theInstance;

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
    Dashboard dashboard;
    SzczegolyIncydentu incydent;
    TworzenieAudytu tworzenieAudytu;


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


/**Filtrowanie incydentow*/

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

/**Filtrowanie pracownikow*/

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

/**Dodanie nowego incydentu*/

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

/**Sprawdzenie listy incydentow*/

    @Step
    public void wpiszEmailU3() {
        stronaLogowaniaU.wpiszEmailU3();
    }

    @Step
    public void wpiszHasloU3() {
        stronaLogowaniaU.wpiszHasloU3();
    }

    @Step
    public void pustaListaIncydentow() {
        incydenty.brakIncydentow();
    }

/**Statystyki*/

    @Step
    public void wybierzDashboard() {
        incydenty.wybierzDashboard();
    }

    @Step
    public void statystykiIncydentow() {
        dashboard.statystykaIncydentyTabela();
    }
/**Usuwanie pracownika*/
    public void wybieraPracownika() {
        listaKont.wybieraPracownika();
    }

    @Step
    public void kliknijAkcja() {
        listaKont.kliknijAkcja();
    }

    @Step
    public void kliknijDelete() {
        listaKont.kliknijDelete();
    }

    @Step
    public void komunikatKontoUsuniete() {
        listaKont.komunikatKontoUsuniete();
    }

    @Step
    public void brakKontaNaLiscie() {
        listaKont.brakKontaNaLiscie();
    }

/**Wyszukiwanie incydentow po identyfikatorze*/

    @Step
    public void wyszukanieIncydentuId1() {
        incydenty.wyszukajIncydent1();
    }

    @Step
    public void szczegolyIncydentuId1() {
        incydent.szczegolyIncydentuId1();
    }

    @Step
    public void wyszukanieIncydentuId21() {
        incydenty.wyszukajIncydent21();
    }

    @Step
    public void komunikatNieZnalezionoIncydentu() {
        incydenty.komunikatNieZnalezionoIncydentu();
    }

/**Szczegoly incydentu - pracownik*/

    @Step
    public void wybierzeAkcja() {
        incydenty.wybierzAkcja();
    }

    @Step
    public void wybierzeSzczegolyIncydentu() {
        incydenty.wybierzSzczegolyIncydentu();
    }

    @Step
    public void kliknijOpisIncydentu() {
        incydent.kliknijOpisIncydentu();
    }

    @Step
    public void wprowadziNowyOpis() {
        incydent.wprowadziNowyOpis();
    }

    @Step
    public void wybierzIncydenty() {
        incydent.kliknikIncydenty();
    }

    @Step
    public void sprawdzNowyOpis() {
        incydent.sprawdzNowyOpis();
    }

    @Step
    public void kliknijPrzegladaj() {
        incydent.kliknijPrzegladaj();
    }

    @Step
    public void wyszukaniePliku() throws IOException {
        Runtime.getRuntime().exec("C:\\DodawaniePliku.exe");
    }

    @Step
    public void kliknijUpload() {
        incydent.przyciskUpload();
    }

    @Step
    public void plikDodany() {
        incydent.sprawdzCzyPlikDodany();
    }

/**Szczegóły incydentu - użytkownik*/

    @Step
    public void kliknieAkcja() {
        incydenty.kliknijAkcja();
    }

    @Step
    public void kliknieSzczegoly() {
        incydenty.kliknijSzczegoly();
    }

    @Step
    public void wprodzaNowyOpis() {
        incydent.wprowadzaNowyOpis();
    }

    @Step
    public void nowyOpis() {
        incydent.nowyOpisUzytkownika();
    }

    @Step
    public void nowyPlikDodany() {
        incydent.komunikatPlikDodany();
    }

/**Obsługa incydentu - administrator*/

    @Step
    public void wyborIncydentu() {
        incydenty.wyborIncydentu();
    }

    @Step
    public void wybierzDodajAudyt() {
        incydenty.wybierzDodajAudyt();
    }

    @Step
    public void rozwijanieListyStatusow() {
        tworzenieAudytu.klikniecieNowyStatus();
    }

    @Step
    public void klikniecieDodajAudyt() {
        tworzenieAudytu.kliknijDodajAudyt();
    }

    @Step
    public void komunikatAudytDodany() {
        incydent.komunikatAudytDodany();
    }

    @Step
    public void wybranieAkcja() {
        incydenty.wybranieAkcja();
    }

    @Step
    public void wybraniePracownika() {
        tworzenieAudytu.wyborPracownika();
    }

    @Step
    public void incydentPrzypisany() {
        incydent.przypisanie();
    }
}