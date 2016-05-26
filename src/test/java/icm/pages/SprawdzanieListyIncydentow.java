package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Anetka on 2016-05-26.
 */
@DefaultUrl("http://localhost:9998/signin")
public class SprawdzanieListyIncydentow extends PageObject {

    @FindBy(name = "j_username")
    WebElementFacade wpisanyEmail;

    @FindBy (name = "j_password")
    WebElementFacade wpisaneHaslo;

    @FindBy (id = "signin")
    WebElementFacade przyciskZaloguj;

    @FindBy (xpath = "//p[contains(.,'Nie znaleziono rekordów')]")
    private WebElement komunikat2;

    public void wpiszEmail() {
        element(wpisanyEmail).type("icm-user3@icm.com");
    }

    public void wpiszHaslo() {

        element(wpisaneHaslo).type("!1");
    }

    public void wcisnijPrzyciskZalogujSie() {
        element(przyciskZaloguj).click();
    }

    public void assertNieZnalezionoRekordow() {
        element(komunikat2).shouldContainText("Nie znaleziono rekordów");
    }


}