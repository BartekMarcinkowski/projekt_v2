package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Bartek on 2016-05-18.
 */
@DefaultUrl("http://localhost:9998/account/list")
public class ListaKont extends PageObject{

    @FindBy (xpath = "//a[contains(.,'Dodaj pracownika')]")
    WebElementFacade przyciskDodajPracownika;

    @FindBy (xpath = "//span[contains(.,'Konto zostało utworzone')]")
    private WebElement napisKontoUtworzone;

    public void kliknijDodajPracownika() {
        element(przyciskDodajPracownika).click();
    }

    public void assertNapisKontoUtworzone() {
        element(napisKontoUtworzone).shouldContainOnlyText("Konto zostało utworzone");
    }
}
