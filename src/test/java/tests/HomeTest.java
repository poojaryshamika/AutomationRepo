package tests;

        import org.testng.annotations.AfterMethod;
        import org.testng.annotations.BeforeMethod;
        import org.testng.annotations.Test;
        import org.testng.asserts.SoftAssert;
        import pages.DropDownPage;
        import pages.HomePage;
        import testbase.WebTest;

public class HomeTest extends WebTest {
    HomePage homePage;
    DropDownPage dropDownPage;

    public HomeTest(){
        super();
    }
    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        dropDownPage = new DropDownPage();
    }

    @Test(description = "Search Test", priority = 1)
    public void verifySearchFunctionality() {
            SoftAssert softAssert = new SoftAssert();
            homePage.closedFirstAdvertise();
            homePage.searchBox(prop.getProperty("search"));
            homePage.searchClick();
            homePage.earringClick();
            softAssert.assertAll();
    }
    @Test(description = "WindowsHandle Test", priority = 2)
    public void verifyGetWindows(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertise();
        homePage.scrollDown();
        homePage.windowsClick();
        softAssert.assertAll();
    }
    @Test(description = "MouseHover Test", priority = 3)
    public void verifyMouseHoverFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertise();
        homePage.mouseHover();
        softAssert.assertAll();
    }
    @Test(description = "Radio Button", priority = 4)
    public void verifyRadioBtnFunctionality() {
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertise();
        homePage.radioClick();
        softAssert.assertAll();
    }
    @Test(description = "DropDown", priority = 5)
    public void verifyDropDownFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertise();
        homePage.searchBox(prop.getProperty("search"));
        homePage.searchClick();
        dropDownPage.selectDropDown(prop.getProperty("size"));
        softAssert.assertAll();

    }
    @Test(description = "Cookies", priority = 6)
    public void verifyCookieFunctionality(){
        SoftAssert softAssert = new SoftAssert();
        homePage.closedFirstAdvertise();
        homePage.cookieFrame();
        softAssert.assertAll();
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
