package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id = "login")
    public WebElement btn_login;

    @FindBy(id = "userName-value")
    public WebElement elm_userName;

    @FindBy(xpath = "//span[contains(text(), 'Book Store')]")
    public WebElement btn_BookStore;

    @FindBy(xpath = "//span[contains(text(), 'Profile')]")
    public WebElement btn_Profile;
}
