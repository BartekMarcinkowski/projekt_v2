package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Bartek on 2016-05-23.
 */
@DefaultUrl("http://localhost:9998/dashboard")
public class Dashboard extends PageObject {

    @FindBy(xpath = "//h3[@class='panel-title']")
    private WebElement statystykaIncydentow;

/**Statystyki*/
    public void statystykaIncydentyTabela() {
        element(statystykaIncydentow).containsText("Incydenty");
    }
}
