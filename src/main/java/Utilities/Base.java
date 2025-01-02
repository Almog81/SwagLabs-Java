package Utilities;
import MobilePageObject.MobileHomePage;
import MobilePageObject.MobileLoginPage;
import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class Base {
    protected static String url = "https://www.saucedemo.com/v1/index.html";
    protected static String appiumUrl = "http://127.0.0.1:4723/";
    protected static final String DDT_PATH = "src/main/java/DDT/";
    //General
    protected static WebDriverWait wait;
    protected static WebDriver driver;
    protected static AppiumDriver appiumDriver;
    protected static SoftAssert softAssert;

    //PageObject
    protected static HomePage SwagHomePage;
    protected static LoginPage SwagLoginPage;
    protected static CartPage swagCartPage;

    protected static MobileLoginPage mobileLoginPage;
    protected static MobileHomePage mobileHomePage;

}
