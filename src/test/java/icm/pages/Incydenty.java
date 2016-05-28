package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Bartek on 2016-05-12.
 */
@DefaultUrl("http://localhost:9998/incident/list")
public class Incydenty extends PageObject {

    @FindBy(xpath = "//h2[contains(.,'Incydenty')]")
    private WebElement naglowek;

    @FindBy(xpath = "//a[contains(.,'Logout')]")
    private WebElement przycisk;

    @FindBy(xpath = "//a[contains(.,'Użytkownicy')]")
    private  WebElement przycisk1;

    @FindBy(xpath = "//button[contains(.,'Filter')]")
    private WebElement przycisk2;

    @FindBy(xpath = "//a[contains(.,'Zgłoszony')]")
    private WebElement przycisk3;

    @FindBy(xpath = "//a[contains(.,'Utwórz incydent')]")
    private WebElement przycisk4;

    @FindBy (id = "alert")
    private WebElement komunikat;

    @FindBy(className = "text-muted")
    private WebElement pustaLista;

    @FindBy(xpath = "//a[contains(.,'Dashboard')]")
    private WebElement kliknijDashboard;

    @FindBy(name = "q")
    WebElementFacade oknoWyszukiwaniaIncydentu;

    @FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr[3]/td[5]/div/button")
    private WebElement przyciskAkcja;

    @FindBy(linkText = "Szczegóły")
    private WebElement przyciskSzczegoly;

    @FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr[1]/td[5]/div/button")
    private WebElement przyciskAkcja1;

    @FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr[2]/td[5]/div/button")
    private WebElement przyciskAkcja2;

    @FindBy(linkText = "Dodaj audyt")
    private WebElement przyciskDodajAudyt;

    @FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr[1]/td[5]/div/button")
    private WebElement przyciskAkcja3;

    /**Logowanie*/
    public void assertNapisIncydenty() {
        element(naglowek).shouldContainOnlyText("Incydenty");
    }

/**Zakladanie konta*/
    public void assertPrzyciskLogout() {
        element(przycisk).shouldContainOnlyText("Logout");
    }

/** Dodawanie nowego pracownika*/

    public void wcisnijPrzyciskUzytkownicy() {
        element(przycisk1).click();
    }

/**Filtrowanie incydentow*/

    public void kliknijFiltruj() {
        element(przycisk2).click();
    }

    public void kliknijZgloszony() {
        element(przycisk3).click();
    }

/**Dodanie nowego incydentu*/

    public void kliknijUtworzIncydent() {
        element(przycisk4).click();
    }

    public void assertIncydentUtworzony() {
        element(komunikat).containsElements("//span[@id='alert']");
    }

/**SprawdzenieListyIncydentow*/

    public void brakIncydentow() {
        element(pustaLista).containsElements("//p[contains(@class,'text-muted')]");
    }

/**Statystyki*/

    public void wybierzDashboard() {
        element(kliknijDashboard).click();
    }

/**Wyszukiwanie incydentu po identyfikatorze*/

    public void wyszukajIncydent1() {
        element(oknoWyszukiwaniaIncydentu).typeAndEnter("1");
    }

    public void wyszukajIncydent21() {
        element(oknoWyszukiwaniaIncydentu).typeAndEnter("21");
    }

    public void komunikatNieZnalezionoIncydentu() {
        shouldContainText("Nie znaleziono incydentu");
    }

/**Szczegoly incydentu - pracownik*/

    public void wybierzAkcja() {
        element(przyciskAkcja).click();
    }

    public void wybierzSzczegolyIncydentu() {
        element(przyciskSzczegoly).click();
    }

/**Szczegóły incydentu - użytkownik*/

    public void kliknijAkcja() {
        element(przyciskAkcja1).click();
    }

    public void kliknijSzczegoly() {
        element(przyciskSzczegoly).click();
    }

/**Obsługa incydentu - administrator*/

    public void wyborIncydentu() {
        element(przyciskAkcja2).click();
    }

    public void wybierzDodajAudyt() {
        element(przyciskDodajAudyt).click();
    }

    public void wybranieAkcja() {
        element(przyciskAkcja3).click();
    }
}
