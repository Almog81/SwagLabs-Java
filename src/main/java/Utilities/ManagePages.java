package Utilities;
import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends CommonOps{
    public static void initPages(){
        ParaHomePage = PageFactory.initElements(driver, HomePage.class);
        ParaLoginPage = PageFactory.initElements(driver, LoginPage.class);
        ParaCreateAccountPage = PageFactory.initElements(driver, CreateAccountPage.class);
    }
}
