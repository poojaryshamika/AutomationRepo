package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import util.ActionStuff;
import util.Utility;

import java.util.List;

public class DropDownPage extends WebTest {

    @FindBy(xpath = "//img[@alt='The Adrithi Gold Bangle']")
    WebElement bangleSelect;

    @FindBy(xpath = "//span[@class='icon-ion-android-arrow-dropdown']")
    WebElement dropDown;

    @FindBy(xpath = "//ul[@id='sizeDropdown']//following::span[@class='size']")
    List<WebElement> elements;


    public DropDownPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectDropDown(String size) {
        bangleSelect.click();
        ActionStuff.switchToWindowsHandles(driver);
        Utility.waitUntilElementToBeClick(driver, dropDown);
        dropDown.click();
        Utility.dropDownElement(elements, size);
    }
}





    /*public void scrollUpDown(){
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,300)");
    }*/


