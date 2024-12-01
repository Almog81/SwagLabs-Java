package Utilities;

import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Base {
    protected static String url = "http://www.automationpractice.pl/";
    //General
    protected static WebDriverWait wait;
    protected static WebDriver driver;
    protected static SoftAssert softAssert;

    //PageObject
    protected static HomePage APHomePage;
    protected static LoginPage APLoginPage;
    protected static CreateAccountPage APCreateAccountPage;



}
