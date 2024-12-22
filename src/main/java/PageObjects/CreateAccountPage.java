package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {

    @FindBy(id = "customer.firstName")
    public WebElement txt_firstName;

    @FindBy(id = "customer.lastName")
    public WebElement txt_lastName;

    @FindBy(id = "customer.address.street")
    public WebElement txt_address;

    @FindBy(id = "customer.address.city")
    public WebElement txt_city;

    @FindBy(id = "customer.address.state")
    public WebElement txt_state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement txt_zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement txt_phone;

    @FindBy(id = "customer.ssn")
    public WebElement txt_ssn;

    @FindBy(id = "customer.username")
    public WebElement username;

    @FindBy(id = "customer.password")
    public WebElement txt_password;

    @FindBy(id = "repeatedPassword")
    public WebElement txt_passwordConfirmation;

    @FindBy(xpath = "//*[@value=\"Register\"]")
    public WebElement btn_submit;

    @FindBy(css = "#rightPanel > p")
    public WebElement elm_messageSuccess;
}

