package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(className = "login")
    public WebElement btn_login;

    @FindBy(id = "nameofuser")
    public WebElement nameOfUser;

}
