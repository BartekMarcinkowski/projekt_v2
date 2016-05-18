package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Bartek on 2016-05-18.
 */
@DefaultUrl("http://localhost:9998/account/create")
public class DodawaniePracownika extends PageObject {

    @FindBy (name = "name")
    WebElementFacade wpisanaNazwa;

    @FindBy (name = "email")
    WebElementFacade wprowadzonyEmail;

    @FindBy (name = "password")
    WebElementFacade wprowadzoneHaslo;

    @FindBy (name = "confirmedPassword")
    WebElementFacade potwierdzoneHaslo;

    @FindBy (id = "create")
    WebElementFacade przyciskDodajPracownika;

    public void wpiszNazwe() {
        element(wpisanaNazwa).type("janek");
    }

    public void wprowadzEmail() {
        element(wprowadzonyEmail).type("janek@o2.pl");
    }

    public void wprowadzHaslo() {
        element(wprowadzoneHaslo).type("!1");
    }

    public void potwrdzHaslo() {
        element(potwierdzoneHaslo).type("!1");
    }

    public void wcisnijPrzyciskDodajPracownika() {
        element(przyciskDodajPracownika).click();
    }
}
