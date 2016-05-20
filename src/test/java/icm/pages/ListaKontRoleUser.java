package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Bartek on 2016-05-20.
 */

@DefaultUrl("http://localhost:9998/account/list?role=ROLE_USER")
public class ListaKontRoleUser extends PageObject {

    @FindBy (xpath = "//td[contains(.,'ROLE_USER')]")
    private WebElement roleUser;

    public void assertRoleUser() {
        element(roleUser).shouldContainOnlyText("ROLE_USER");
    }
}
