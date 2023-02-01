package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTest;
import util.Utility;

import java.util.List;

public class LoginPage extends WebTest {
    @FindBy(id = "login")
    WebElement loginAccountBtn;

    @FindBy(id = "logInWithEmail")
    WebElement loginWithEmail;

    @FindBy(id = "email-id")
    WebElement emailBox;

    @FindBy(id = "password")
    WebElement passwordBox;

    @FindBy(id = "edit-login-account")
    WebElement loginBtn;

    @FindBy(xpath = "//span[text()='Shamika']")
    WebElement loginElement;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    public void loginClick(){
        Utility.waitUntilElementToBeClick(driver, loginAccountBtn);
        loginAccountBtn.click();
    }
    public void login(String email, String password) {
        loginWithEmail.click();
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        loginBtn.click();
    }
    public String getText() {
        return loginElement.getText();
    }

}
