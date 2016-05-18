package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by Bartek on 2016-05-12.
 */
@DefaultUrl("http://localhost:9998/signin")
public class StronaLogowania extends PageObject {

    @FindBy (name = "j_username")
    WebElementFacade wpisanyEmail;

    @FindBy (name = "j_password")
    WebElementFacade wpisaneHaslo;

    @FindBy (id = "signin")
    WebElementFacade przyciskZaloguj;


    public void wpiszEmail() {
        element(wpisanyEmail).type("icm-admin@icm.com");
    }

    public void wpiszHaslo() {
        element(wpisaneHaslo).type("!1");
    }

    public void wcisnijPrzyciskZalogujSie() {
        element(przyciskZaloguj).click();
    }
}
