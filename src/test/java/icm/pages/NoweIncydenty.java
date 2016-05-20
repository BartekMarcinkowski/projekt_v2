package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Bartek on 2016-05-20.
 */
@DefaultUrl("http://localhost:9998/incident/list?status=NEW")
public class NoweIncydenty extends PageObject {

    @FindBy(xpath = "//td[contains(.,'Zgłoszony')]")
    private WebElement status;

    public void assertZgloszonyIncydent() {
        element(status).shouldContainOnlyText("Zgłoszony");

    }
}
