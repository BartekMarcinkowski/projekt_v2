package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
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
}
