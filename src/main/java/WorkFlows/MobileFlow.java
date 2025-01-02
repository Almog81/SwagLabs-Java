package WorkFlows;

import Utilities.CommonOps;
import Utilities.UiAction;
import org.json.simple.JSONObject;



public class MobileFlow extends CommonOps {

    public static void loginAction(JSONObject userData) {
        UiAction.fillAction(mobileLoginPage.txt_username, userData.get("username").toString());
        UiAction.fillAction(mobileLoginPage.txt_Password,  userData.get("password").toString());
        UiAction.clickAction(mobileLoginPage.btn_login);
    }

    public static void safeLoginAction() {
        Object[][] loginData = getDataFromJson(DDT_PATH + "LoginData.json");
        JSONObject standardUser = (JSONObject) loginData[0][0];
        loginAction(standardUser);
    }


}
