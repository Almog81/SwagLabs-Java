package WorkFlows;
import Utilities.CommonOps;
import Utilities.UiAction;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;


public class WebFlow extends CommonOps {
    public static void naviToHomePage(){
        driver.get(url);
    }
    public static void loginAction(JSONObject userData) {
        UiAction.fillAction(ParaLoginPage.txt_username, userData.get("username").toString());
        UiAction.fillAction(ParaLoginPage.txt_Password,  userData.get("password").toString());
        UiAction.clickAction(ParaLoginPage.btn_login);
    }

    public static void signOutAction() {
        UiAction.clickAction(ParaHomePage.signOut);
    }

    public static void CreateAccountAction(JSONObject userData) {
        UiAction.clickAction(ParaHomePage.btn_Register);
        UiAction.fillAction(ParaCreateAccountPage.txt_firstName, userData.get("firstName").toString());
        UiAction.fillAction(ParaCreateAccountPage.txt_lastName, userData.get("lastName").toString());
        UiAction.fillAction(ParaCreateAccountPage.txt_address, userData.get("address").toString());
        UiAction.fillAction(ParaCreateAccountPage.txt_city, userData.get("city").toString());
        UiAction.fillAction(ParaCreateAccountPage.txt_state, userData.get("state").toString());
        UiAction.fillAction(ParaCreateAccountPage.txt_zipCode, userData.get("zipCode").toString());
        UiAction.fillAction(ParaCreateAccountPage.txt_phone, userData.get("phone").toString());
        UiAction.fillAction(ParaCreateAccountPage.txt_ssn, userData.get("ssn").toString());
        UiAction.fillAction(ParaCreateAccountPage.username, userData.get("username").toString());
        UiAction.fillAction(ParaCreateAccountPage.txt_password, userData.get("password").toString());
        UiAction.fillAction(ParaCreateAccountPage.txt_passwordConfirmation, userData.get("password").toString());
        UiAction.clickAction(ParaCreateAccountPage.btn_submit);
    }

    // Verify Text In Element
    public static void verifyTextInElement(WebElement elem, String expected) {
        UiAction.isElementVisible(elem);
        assertEquals(UiAction.getText(elem), expected);
    }

    // Verify Text In Element
    public static void verifyElementVisible(WebElement elem) {
        assert(UiAction.isElementVisible(elem));
    }

}
