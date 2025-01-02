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
        UiAction.fillAction(SwagLoginPage.txt_username, userData.get("username").toString());
        UiAction.fillAction(SwagLoginPage.txt_Password,  userData.get("password").toString());
        UiAction.clickAction(SwagLoginPage.btn_login);
        verifyLoginResult(userData.get("username").toString());
    }

    public static void safeLoginAction() {
        Object[][] loginData = getDataFromJson(DDT_PATH + "LoginData.json");
        JSONObject standardUser = (JSONObject) loginData[0][0];
        loginAction(standardUser);
    }

    public static void signOutAction() {
        UiAction.clickAction(SwagHomePage.btn_menu);
        UiAction.clickAction(SwagHomePage.btn_logout);
    }

    public static void verifyLoginResult(String typeOfUser) {
        switch (typeOfUser) {
            case "standard_user":
                verifyElementVisible(SwagHomePage.elm_productLabel);
                System.out.println("Login successful for standard user.");
                break;

            case "locked_out_user":
                verifyElementVisible(SwagLoginPage.elm_errorMessage);
                String errorMessage = UiAction.getText(SwagLoginPage.elm_errorMessage);
                if (!errorMessage.contains("Sorry, this user has been locked out.")) {
                    throw new AssertionError("Expected locked out error message is missing.");
                }
                System.out.println("Locked out user verified successfully.");
                break;

            //TODO deterrent Test
            case "problem_user":
                verifyElementVisible(SwagHomePage.elm_productLabel);
                if (!UiAction.isImageDisplayed(SwagHomePage.img_inventory.get(0))) {
                    throw new AssertionError("Problem user: Image issue not detected as expected.");
                }
                System.out.println("Problem user issues verified successfully.");
                break;

            case "performance_glitch_user":
                long startTime = System.currentTimeMillis();
                verifyElementVisible(SwagHomePage.elm_productLabel);
                long endTime = System.currentTimeMillis();
                if ((endTime - startTime) > 5000) {
                    System.out.println("Performance glitch user: Verified delay in loading.");
                } else {
                    System.out.println("Performance glitch user: No significant delay detected.");
                }
                break;

            default:
                throw new IllegalArgumentException("Unknown user type: " + typeOfUser);
        }
    }

    public static void addToCartAction() {
        //Todo
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
