package WorkFlows;
import Utilities.CommonOps;
import Utilities.UiAction;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;


public class WebFlow extends CommonOps {
    public static void naviToHomePage(){
        driver.get(url);
    }
    public static void loginAction(String email, String pass ) {
        UiAction.clickAction(LumaHomePage.btn_login);
        UiAction.fillAction(LumaLoginPage.txt_email, email);
        UiAction.fillAction(LumaLoginPage.txt_Password, pass);
        UiAction.clickAction(LumaLoginPage.btn_signIn);
    }

    public static void CreateAccountAction(String firstName, String lastName, String email, String password ) {
        UiAction.clickAction(LumaHomePage.btn_CreateAccount);
        UiAction.fillAction(LumaCreateAccountPage.txt_firstName, firstName);
        UiAction.fillAction(LumaCreateAccountPage.txt_lastName, lastName);
        UiAction.fillAction(LumaCreateAccountPage.txt_email, email);
        UiAction.fillAction(LumaCreateAccountPage.txt_password, password);
        UiAction.fillAction(LumaCreateAccountPage.txt_passwordConfirmation, password);
        UiAction.clickAction(LumaCreateAccountPage.btn_submit);
    }

    // Verify Text In Element
    public static void verifyTextInElement(WebElement elem, String expected) {
        assertEquals(UiAction.getText(elem), expected);
    }

    // Verify Text In Element
    public static void verifyElementVisible(WebElement elem) {
        assert(UiAction.isElementVisible(elem));
    }

}
