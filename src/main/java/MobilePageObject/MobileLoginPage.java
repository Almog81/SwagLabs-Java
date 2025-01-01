package MobilePageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileLoginPage {
    //login
    @FindBy(xpath = "//*[@text=\"Username\"]")
    public WebElement txt_username;

    @FindBy(xpath = "//*[@text=\"Password\"]")
    public WebElement txt_Password;

    @FindBy(xpath = "//*[@text=\"LOGIN\"]")
    public WebElement btn_login;

    @FindBy(xpath = "//*[@data-test=\"error\"]")
    public WebElement elm_errorMessage;

}
