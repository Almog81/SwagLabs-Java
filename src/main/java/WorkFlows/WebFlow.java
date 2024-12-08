package WorkFlows;
import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;


public class WebFlow extends CommonOps {
    public static void naviToHomePage(){
        driver.get(url);
    }
    public static void loginAction(String user, String pass ) {
        QaHomePage.btn_login.click();
        QaLoginPage.txt_userName.sendKeys(user);
        QaLoginPage.txt_Password.sendKeys(pass);
        QaLoginPage.btn_login.click();
    }

    // Verify Text In Element
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }
}
