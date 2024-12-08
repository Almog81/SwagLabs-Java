package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    //login
    @FindBy(id = "userName")
    public WebElement txt_userName;

    @FindBy(id = "password")
    public WebElement txt_Password;

    @FindBy(id = "login")
    public WebElement btn_login;

}
