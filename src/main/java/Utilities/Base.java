package Utilities;
import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Base {
    protected static String url = "https://magento.softwaretestingboard.com/";
    //General
    protected static WebDriverWait wait;
    protected static WebDriver driver;
    protected static SoftAssert softAssert;

    //PageObject
    protected static HomePage LumaHomePage;
    protected static LoginPage LumaLoginPage;
    protected static CreateAccountPage LumaCreateAccountPage;

}
