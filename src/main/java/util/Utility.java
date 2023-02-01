package util;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTest;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Utility extends WebTest {
    public static final long PAGE_LOAD_TIMEOUT = 30;
    public static final long IMPLICITLY_WAIT = 30;

    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void dropDownElement(List<WebElement> elements, String size) {
        for (WebElement e : elements) {
            System.out.println(e.getText());
            if (e.getText().equalsIgnoreCase(size)) {
                e.click();
                break;
            }
        }
    }
    public static void addCookie() {
        Cookie cookie = new Cookie("Welcome", "to bluestone store");
        driver.manage().addCookie(cookie);

    }

    public static void setCookies() {
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies) {
            System.out.println(c);
        }
    }
}
