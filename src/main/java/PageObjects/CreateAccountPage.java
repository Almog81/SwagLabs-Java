package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage {

    @FindBy(id = "id_gender1")
    public WebElement male;

    @FindBy(id = "id_gender2")
    public WebElement female;

    @FindBy(id = "customer_firstname")
    public WebElement txt_customerFirstname;

    @FindBy(id = "customer_lastname")
    public WebElement txt_customerLastname;

    @FindBy(id = "passwd")
    public WebElement txt_userPassword;

    @FindBy(id = "days")
    public WebElement drop_days;

    @FindBy(id = "months")
    public WebElement drop_months;

    @FindBy(id = "years")
    public WebElement drop_years;

    @FindBy(id = "newsletter")
    public WebElement box_newsletter;

    @FindBy(css = "#submitAccount > span")
    public WebElement btn_submitAccount;

}
