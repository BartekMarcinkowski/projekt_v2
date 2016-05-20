package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Bartek on 2016-05-20.
 */
@DefaultUrl("http://localhost:9998/incident/create")
public class NowyIncydent extends PageObject {

    @FindBy (name = "type")
    WebElementFacade wpisanyTypIncydentu;

    @FindBy (name = "description")
    WebElementFacade wpisanyOpisIncydentu;

    @FindBy (name = "addressLine")
    WebElementFacade wpisanyAdresIncydentu;

    @FindBy (name = "cityLine")
    WebElementFacade wpisanyKodMiastoIncydentu;

    @FindBy (id = "create")
    WebElementFacade kliknijUtworzI;

    @FindBy (id = "alert")
    private WebElement komunikat;

    public void wpiszTypIncydentu() {
        element(wpisanyTypIncydentu).type("Zalana piwnica");
    }

    public void wpiszOpisIncydentu() {
        element(wpisanyOpisIncydentu).type("Pęknięta rura spowodowała zalanie piwnicy");
    }

    public void wpiszAdresIncydentu() {
        element(wpisanyAdresIncydentu).type("ul. Warszawska 13");
    }

    public void kodMiastoIncydentu() {
        element(wpisanyKodMiastoIncydentu).type("01-001 Warszawa");
    }

    public void kliknijUtworzI() {
        element(kliknijUtworzI).click();
    }

    public void assertIncydentNieUtworzony() {
        element(komunikat).containsElements("//span[contains(@id,'alert')]");
    }
}
