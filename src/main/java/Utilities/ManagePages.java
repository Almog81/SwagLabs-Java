package Utilities;
import MobilePageObject.MobileHomePage;
import MobilePageObject.MobileLoginPage;
import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends CommonOps{
    public static void initPages(){
        SwagHomePage = PageFactory.initElements(driver, HomePage.class);
        SwagLoginPage = PageFactory.initElements(driver, LoginPage.class);
        swagCartPage = PageFactory.initElements(driver, CartPage.class);

        mobileLoginPage = PageFactory.initElements(driver, MobileLoginPage.class );
        mobileHomePage = PageFactory.initElements(driver, MobileHomePage.class);
    }
}
