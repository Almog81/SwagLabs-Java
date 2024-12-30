package PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

    @FindBy(id = "repeatedPassword")
    public WebElement txt_passwordConfirmation;

    @FindBy(xpath = "//*[@value=\"Register\"]")
    public WebElement btn_submit;

    @FindBy(css = "#rightPanel > p")
    public WebElement elm_messageSuccess;
}

