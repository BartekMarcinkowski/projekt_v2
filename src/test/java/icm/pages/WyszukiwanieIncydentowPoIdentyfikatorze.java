package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Anetka on 2016-05-26.
 */
@DefaultUrl("http://localhost:9998/incident/list")
public class WyszukiwanieIncydentowPoIdentyfikatorze extends PageObject {

    @FindBy (xpath = "//p[contains(.,'Nie znaleziono rekordów')]")
    private WebElement komunikat2;

    @FindBy (name = "q")
    WebElementFacade wpisanyIDIncydentu;

    @FindBy (id = "search")
    WebElementFacade kliknijSzukaj;

    @FindBy (xpath = "//h2[contains(.,'Szczegóły')]")
    private WebElement IDIncydentu;

    public void assertNieZnalezionoRekordow2() {
        element(komunikat2).shouldNotBeCurrentlyVisible();
    }

    public void wpiszIDIncydentu() {
        element(wpisanyIDIncydentu).type("2");
    }

    public void kliknijSzukaj() {
        element(kliknijSzukaj).click();
    }

    public void assert2() {
        element(IDIncydentu).shouldContainOnlyText("Szczegóły");
    }

}
