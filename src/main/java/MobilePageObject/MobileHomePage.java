package MobilePageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MobileHomePage {

    @FindBy(className = "product_label")
    public WebElement elm_productLabel;

    @FindBy(xpath = "//*[@content-desc=\"test-Menu\"]")
    public WebElement btn_menu;

    @FindBy(id = "logout_sidebar_link")
    public WebElement btn_logout;

    @FindBy(className = "inventory_item_img")
    public List<WebElement> img_inventory;
}
