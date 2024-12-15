package Utilities;
import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends CommonOps{
    public static void initPages(){
        LumaHomePage = PageFactory.initElements(driver, HomePage.class);
        LumaLoginPage = PageFactory.initElements(driver, LoginPage.class);
        LumaCreateAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
    }
}
