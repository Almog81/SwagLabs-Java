package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(className = "logged-in")
    public WebElement elm_loggedIn;

    @FindBy(xpath = "//a[contains(text(), 'Register')]")
    public WebElement btn_Register;

    @FindBy(xpath = "//a[contains(text(), 'Log Out')]")
    public WebElement signOut;
}
