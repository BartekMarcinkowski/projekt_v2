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

    @FindBy (name = "j_password")
    WebElementFacade wpisaneHasloU;

    public void wpiszEmailU() {
        element(wpisanyEmailU).type("icm-user1@icm.com");
    }

    public void wpiszHasloU() {
        element(wpisaneHasloU).type("!1");
    }
}
