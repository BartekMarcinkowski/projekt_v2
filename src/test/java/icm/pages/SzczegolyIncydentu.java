package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by Bartek on 2016-05-26.
 */

public class SzczegolyIncydentu extends PageObject {

    @FindBy(xpath = "/html/body/div/div[1]")
    private WebElement informacje;

    @FindBy(xpath = "//button[@class='btn btn-default btn-xs description-slide']")
    private WebElement opisIncydentu;

    @FindBy(xpath = "//div[@class='well well-lg description-content']")
    private WebElement oknoOpisu;

    @FindBy(xpath = "//textarea[@class='form-control']")
    WebElementFacade tekstOpisu;

    @FindBy(xpath = "/html/body/nav/div/div[2]/ul[1]/li/a")
    private WebElement zakladkaIncydenty;

    @FindBy(xpath = "//input[@id='file']")
    private WebElement przyciskPrzegladaj;

    @FindBy(xpath = "//button[contains(.,'Upload')]")
    private WebElement przyciskUpload;

    @FindBy(id = "alert")
    private WebElement alert;

    @FindBy(xpath = "/html/body/div/div[2]/div[1]/div[1]/div/table/tbody/tr[8]/td/address")
    private WebElement polePrzypisania;


/**Wyszukiwanie incydentow po identyfikatorze*/

    public void szczegolyIncydentuId1() {
        element(informacje).shouldContainText("Szczegóły");
        element(informacje).shouldContainText("Podstawowe informacje");
        element(informacje).shouldContainText("Audyty");
        element(informacje).shouldContainText("Pliki");
    }

/**Szczegoly incydentu - pracownik*/

    public void kliknijOpisIncydentu() {
        element(opisIncydentu).click();
    }

    public void wprowadziNowyOpis() {
        element(oknoOpisu).click();
        element(tekstOpisu).clear();
        element(tekstOpisu).type("Nowy opis incydentu - pracownik");
        element(opisIncydentu).click();
    }

    public void kliknikIncydenty() {
        element(zakladkaIncydenty).click();
    }

    public void sprawdzNowyOpis() {
        element(opisIncydentu).click();
        element(oknoOpisu).shouldContainText("Nowy opis incydentu - pracownik");
    }

    public void kliknijPrzegladaj() {
        element(przyciskPrzegladaj).click();
    }

    public void przyciskUpload() {
        element(przyciskUpload).click();
    }

    public void sprawdzCzyPlikDodany() {
        element(alert).shouldContainText("File icm.txt uploaded successfully");
    }

/**Szczegoly incydentu - uzytkownik*/

    public void wprowadzaNowyOpis() {
        element(oknoOpisu).click();
        element(tekstOpisu).clear();
        element(tekstOpisu).type("Nowy opis incydentu - użytkownik");
        element(opisIncydentu).click();
    }

    public void nowyOpisUzytkownika() {
        element(opisIncydentu).click();
        element(oknoOpisu).shouldContainText("Nowy opis incydentu - użytkownik");
    }

    public void komunikatPlikDodany() {
        element(alert).shouldContainText("File icm.txt uploaded successfully");
    }

/**Obsługa incydentu - administrator*/

    public void komunikatAudytDodany() {
        element(alert).containsText("Nowy audyt o id został pomyślnie utworzony!");
    }

    public void przypisanie() {
        element(polePrzypisania).containsText("icm-employee");
    }
}
