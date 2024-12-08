package WorkFlows;
import Utilities.CommonOps;
import Utilities.UiAction;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;


public class WebFlow extends CommonOps {
    public static void naviToHomePage(){
        driver.get(url);
    }
    public static void loginAction(String user, String pass ) {
        UiAction.clickAction(QaHomePage.btn_login);
        UiAction.fillAction(QaLoginPage.txt_userName, user);
        UiAction.fillAction(QaLoginPage.txt_Password, pass);
        UiAction.clickAction(QaLoginPage.btn_login);
    }

    // Verify Text In Element
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }
}
