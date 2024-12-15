package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {

    @FindBy(id = "firstname")
    public WebElement txt_firstName;

    @FindBy(id = "lastname")
    public WebElement txt_lastName;

    @FindBy(id = "email_address")
    public WebElement txt_email;

    @FindBy(id = "password")
    public WebElement txt_password;

    @FindBy(id = "password-confirmation")
    public WebElement txt_passwordConfirmation;

    @FindBy(css = ".action.submit.primary")
    public WebElement btn_submit;

    @FindBy(className = "message-success")
    public WebElement elm_messageSuccess;

}
