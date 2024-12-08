package Utilities;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends CommonOps{
    public static void initPages(){
        QaHomePage = PageFactory.initElements(driver, HomePage.class);
        QaLoginPage = PageFactory.initElements(driver, LoginPage.class);
    }
}
