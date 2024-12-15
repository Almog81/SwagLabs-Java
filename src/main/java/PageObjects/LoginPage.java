package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    //login
    @FindBy(id = "email")
    public WebElement txt_email;

    @FindBy(id = "pass")
    public WebElement txt_Password;

    @FindBy(css = ".action.login.primary")
    public WebElement btn_signIn;

}
