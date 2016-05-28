package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

/**
 * Created by Bartek on 2016-05-27.
 */
public class TworzenieAudytu extends PageObject {

    @FindBy(id = "newStatus")
    private WebElement poleNowyStatus;

    @FindBy(xpath = "//button[@id='create']")
    private WebElement przyciskDodajAudyt;

    @FindBy(xpath = "//select[@id='assigneeId']")
    private WebElement listaPracownikow;

    public void klikniecieNowyStatus() {
        element(poleNowyStatus).then("//option[@value='NEW']").click();
    }

    public void kliknijDodajAudyt() {
        element(przyciskDodajAudyt).click();
    }

    public void wyborPracownika() {
        element(listaPracownikow).then("//option[@label='icm-employee']").click();
    }
}
