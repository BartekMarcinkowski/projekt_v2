package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Bartek on 2016-05-14.
 */
@DefaultUrl("http://localhost:9998/signup")
public class StronaRejstracji extends PageObject {

    @FindBy (name = "name")
    WebElementFacade wpisanaNazwa;

    @FindBy (name = "email")
    WebElementFacade wpisanyEmail1;

    @FindBy (name = "password")
    WebElementFacade wpisaneHaslo1;

    @FindBy (name = "confirmedPassword")
    WebElementFacade potwierdzoneHaslo1;

    @FindBy (id = "signup")
    WebElementFacade przyciskZarejstruj;


    public void wpiszNazweUzytkownika() {
        element(wpisanaNazwa).type("wiechu31");
    }

    public void wpiszEmail1() {
        element(wpisanyEmail1).type("wiechu31@wp.pl");
    }

    public void wpiszHaslo1() {
        element(wpisaneHaslo1).type("!1");
    }

    public void potwierdzHaslo1() {
        element(potwierdzoneHaslo1).type("!1");
    }

    public void wcisnijPrzyciskZarejstruj() {
        element(przyciskZarejstruj).click();
    }
}
