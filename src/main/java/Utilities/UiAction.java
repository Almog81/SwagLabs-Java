package Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UiAction extends CommonOps{
    public static void clickAction(WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }
    public static void fillAction(WebElement elem,String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }
    public static String getText(WebElement elem){
        wait.until(ExpectedConditions.visibilityOf(elem));
        return elem.getText();
    }

}
