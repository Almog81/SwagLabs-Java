package Utilities;

import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends CommonOps{
    public static void initPages(){
        APHomePage = PageFactory.initElements(driver, HomePage.class);
        APLoginPage = PageFactory.initElements(driver, LoginPage.class);
        APCreateAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
    }
}
