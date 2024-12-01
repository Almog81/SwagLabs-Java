package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    //login
    @FindBy(name = "email")
    public WebElement txt_loginEmail;

    @FindBy(name = "passwd")
    public WebElement txt_loginPassword;

    @FindBy(id = "SubmitLogin")
    public WebElement btn_submit;

    //create an email
    @FindBy(id = "email_create")
    public WebElement txt_createEmail;

    @FindBy(css = "#SubmitCreate > span")
    public WebElement btn_submitCreate;

}
