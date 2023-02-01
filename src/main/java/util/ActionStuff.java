package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testbase.WebTest;

import java.util.Set;

public class ActionStuff extends WebTest {

    public static void switchToWindows(WebDriver driver) {


        String parentWindows = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentWindows.contentEquals(s)) {
                driver.switchTo().window(s);
                driver.close();
            }
            driver.switchTo().window(parentWindows);
        }
    }

    public static void moveToElement(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }

    public static void switchToWindowsHandles(WebDriver driver) {


        String parentWindows = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentWindows.contentEquals(s)) {
                driver.switchTo().window(s);
            }
        }
    }
}