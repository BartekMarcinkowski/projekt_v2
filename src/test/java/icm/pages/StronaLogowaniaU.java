package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * Created by Bartek on 2016-05-20.
 */
@DefaultUrl("http://localhost:9998/signin")
public class StronaLogowaniaU extends PageObject {

    @FindBy (name = "j_username")
    WebElementFacade wpisanyEmailU;

    @FindBy (name = "j_username")
    WebElementFacade wpisanyEmailU3;

    @FindBy (name = "j_password")
    WebElementFacade wpisaneHasloU;

    @FindBy (name = "j_password")
    WebElementFacade wpisaneHasloU3;

    public void wpiszEmailU() {
        element(wpisanyEmailU).type("icm-user1@icm.com");
    }

    public void wpiszHasloU() {
        element(wpisaneHasloU).type("!1");
    }

/**Sprawdzenie listy incydentow*/

    public void wpiszEmailU3() {
        element(wpisanyEmailU3).type("icm-user3@icm.com");
    }

    public void wpiszHasloU3() {
        element(wpisaneHasloU3).type("!1");
    }
}
