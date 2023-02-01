package pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import util.ActionStuff;
import util.Utility;

import java.util.List;
import java.util.Set;

public class HomePage extends WebTest {
    @FindBy(id = "notificationConfirmation")
    WebElement firstAdvertiseClose;

    @FindBy(id = "denyBtn")
    WebElement denyBtn;

    @FindBy(id = "search_query_top_elastic_search")
    WebElement searchTextBox;

    @FindBy(name = "submit_search")
    WebElement searchClickBtn;

    @FindBy(xpath = " //a[text()=' Earrings']")
    WebElement earringClickBtn;

    @FindBy(xpath = "//span[@class='icon-ion-social-youtube']")
    WebElement youtubeIcon;

    @FindBy(xpath = "//span[@title='Preset Solitaires Jewellery']")
    WebElement solitaireSelect;

    @FindBy(xpath = "//span[@class='edu-icon hs cut-icon']")
    WebElement educationCutSelect;

    @FindBy(xpath = "(//div[@class='nav-content'])[4]")
    WebElement sepSelect;

    //List<WebElement>("//ul[@class='dropdown-menu show']//child::li/span"));

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void closedFirstAdvertise() {
        Utility.waitUntilElementToBeClick(driver, firstAdvertiseClose);
        firstAdvertiseClose.click();
        denyBtn.click();
    }

    public void searchBox(String search) {
        searchTextBox.click();
        searchTextBox.sendKeys(search);
    }

    public void searchClick() {
        searchClickBtn.click();
    }

    public void earringClick() {
        earringClickBtn.click();
    }

    public void scrollDown() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,5000)");
    }

    public void windowsClick() {
        youtubeIcon.click();
        ActionStuff.switchToWindows(driver);
    }

    public void mouseHover() {
        ActionStuff.moveToElement(driver, solitaireSelect);
        solitaireSelect.click();
        educationCutSelect.click();
    }

    public void radioClick() {
        sepSelect.click();
    }
     public void cookieFrame(){
        Utility.addCookie();
        Utility.setCookies();
     }

}
