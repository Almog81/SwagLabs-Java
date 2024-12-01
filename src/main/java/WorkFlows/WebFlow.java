package WorkFlows;

import Utilities.CommonOps;
import org.openqa.selenium.By;
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
    public static void createAccount(String email, String firstName,String lastName, String userPassword, String day, String month, String year) throws InterruptedException {
        APHomePage.btn_login.click();
        APLoginPage.txt_createEmail.sendKeys(email);
        APCreateAccountPage.btn_submitAccount.click();
        APCreateAccountPage.male.click();
        APCreateAccountPage.txt_customerFirstname.sendKeys(firstName);
        APCreateAccountPage.txt_customerLastname.sendKeys(lastName);
        APCreateAccountPage.txt_userPassword.sendKeys(userPassword);

        APCreateAccountPage.drop_days.click();
        APCreateAccountPage.drop_days.findElement(By.xpath("//option[. = 'regexp:" + day + "\\s+']")).click();

        APCreateAccountPage.drop_months.click();
        APCreateAccountPage.drop_months.findElement(By.xpath("//option[. = 'regexp:" + month + "\\s']")).click();

        APCreateAccountPage.drop_years.click();
        APCreateAccountPage.drop_years.findElement(By.xpath("//option[. = 'regexp:" + year + "\\s+']")).click();

        APCreateAccountPage.box_newsletter.click();

        APCreateAccountPage.btn_submitAccount.click();

    }
    //@Step("Verify Text In Element")
    public static void verifyTextInElement(WebElement elem, String expected) {
        wait.until(ExpectedConditions.visibilityOf(elem));
        assertEquals(elem.getText(), expected);
    }
}
