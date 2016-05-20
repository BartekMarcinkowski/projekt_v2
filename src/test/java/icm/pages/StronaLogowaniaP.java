package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by Bartek on 2016-05-20.
 */

@DefaultUrl("http://localhost:9998/signin")
public class StronaLogowaniaP extends PageObject{

    @FindBy(name = "j_username")
    WebElementFacade wpisanyEmailP;

    @FindBy (name = "j_password")
    WebElementFacade wpisaneHasloP;

    @FindBy (id = "signin")
    WebElementFacade przyciskZalogujP;


    public void wpiszEmailP() {
        element(wpisanyEmailP).type("icm-employee@icm.com");
    }

    public void wpiszHasloP() {
        element(wpisaneHasloP).type("!1");
    }

    public void wcisnijPrzyciskZalogujSieP() {
        element(przyciskZalogujP).click();
    }
}
