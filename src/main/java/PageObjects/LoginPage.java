package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    //login
    @FindBy(name = "username")
    public WebElement txt_username;

    @FindBy(name = "password")
    public WebElement txt_Password;

    @FindBy(xpath = "//*[@value=\"Log In\"]")
    public WebElement btn_login;

}
