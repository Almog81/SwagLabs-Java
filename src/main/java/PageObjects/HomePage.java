package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//a[contains(text(), 'Sign In')]")
    public WebElement btn_login;

    @FindBy(className = "logged-in")
    public WebElement elm_loggedIn;

    @FindBy(xpath = "//a[contains(text(), 'Create an Account')]")
    public WebElement btn_CreateAccount;
}
