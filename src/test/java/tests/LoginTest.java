package tests;

        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;
        import org.testng.asserts.SoftAssert;
        import pages.HomePage;
        import testbase.WebTest;


public class LoginTest extends WebTest {
    HomePage homePage;
    pages.LoginPage loginPage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        loginPage = new pages.LoginPage();
    }

    @Test(description = "Login Functionality")
    public void verifyLoginWithValidCredential() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertise();
        loginPage.loginClick();
        loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        softAssert.assertEquals(loginPage.getText(),  "Shamika", "text should match");
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
