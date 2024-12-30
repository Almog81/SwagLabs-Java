package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    //login
    @FindBy(name = "user-name")
    public WebElement txt_username;

    @FindBy(name = "password")
    public WebElement txt_Password;

    @FindBy(id = "login-button")
    public WebElement btn_login;

    @FindBy(xpath = "//*[@data-test=\"error\"]")
    public WebElement elm_errorMessage;

}
