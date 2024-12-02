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
        APHomePage.btn_login.click();
        APLoginPage.txt_loginEmail.sendKeys(user);
        APLoginPage.txt_loginPassword.sendKeys(pass);
        APLoginPage.btn_submit.click();
    }
    public static void createAccount(String email, String firstName,String lastName, String userPassword, String day, String month, String year) {
        APHomePage.btn_login.click();
        APLoginPage.txt_createEmail.sendKeys(email);
        APLoginPage.btn_submitCreate.click();
        APCreateAccountPage.male.click();
        APCreateAccountPage.txt_customerFirstname.sendKeys(firstName);
        APCreateAccountPage.txt_customerLastname.sendKeys(lastName);
        APCreateAccountPage.txt_userPassword.sendKeys(userPassword);

        APCreateAccountPage.drop_days.sendKeys(day);
        APCreateAccountPage.drop_months.sendKeys(month);
        APCreateAccountPage.drop_years.sendKeys(year);

        APCreateAccountPage.box_newsletter.click();

        APCreateAccountPage.btn_submitAccount.click();

    }
    //@Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }
}
