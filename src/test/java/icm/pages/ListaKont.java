package icm.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementState;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.locators.WebElementFacadeListItemHandler;
import org.bouncycastle.util.Selector;
import org.mockito.internal.matchers.Find;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.lift.match.AttributeMatcher;
import org.openqa.selenium.support.FindAll;

/**
 * Created by Bartek on 2016-05-18.
 */
@DefaultUrl("http://localhost:9998/account/list")
public class ListaKont extends PageObject{

    @FindBy (xpath = "//a[contains(.,'Dodaj pracownika')]")
    WebElementFacade przyciskDodajPracownika;

    @FindBy (xpath = "//span[contains(.,'Konto zostało utworzone')]")
    private WebElement napisKontoUtworzone;

    @FindBy (xpath = "//button[contains(.,'Filter')]")
    private WebElement przyciskFiltruj;

    @FindBy(xpath = "//a[contains(.,'ROLE_USER')]")
    private WebElement roleUser;

    @FindBy(id = "accounts")
    private WebElement listaUzytkownikow;

    @FindBy(xpath = "/html/body/div/div[1]/table/tbody/tr[3]")
    private WebElement uzytkownikDoUsuniecia;

    @FindBy(linkText = "Delete")
    private WebElement przyciskDelete;

    @FindBy(id = "alert")
    private WebElement komunikatKontoUsuniete;

/**Dodawanie pracownika*/

    public void kliknijDodajPracownika() {
        element(przyciskDodajPracownika).click();
    }

    public void assertNapisKontoUtworzone() {
        element(napisKontoUtworzone).shouldContainOnlyText("Konto zostało utworzone");
    }

/**Filtrowanie pracownikow*/

    public void kliknijFilter() {
        element(przyciskFiltruj).click();
    }

    public void kliknijRoleUser() {
        element(roleUser).click();
    }
/**Usuwanie pracownika*/

    public void wybieraPracownika() {
        element(listaUzytkownikow).shouldContainText("jas@wp.pl");
    }

    public void kliknijAkcja() {
        element(uzytkownikDoUsuniecia).shouldContainText("jas@wp.pl");
        element(uzytkownikDoUsuniecia).shouldContainElements("//button[@class='btn btn-default dropdown-toggle']");
        element("/html/body/div/div[1]/table/tbody/tr[3]/td[6]/div/button").click();
    }

    public void kliknijDelete() {
        element(przyciskDelete).click();
    }

    public void komunikatKontoUsuniete() {
        element(komunikatKontoUsuniete).shouldContainOnlyText("Account deleted!");
    }

    public void brakKontaNaLiscie() {
        element(listaUzytkownikow).shouldNotContainText("jas@wp.pl");
    }
}
