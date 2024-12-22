package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class UiAction extends CommonOps{
    public static void clickAction(WebElement elem){
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
        waitForPageLoad();
    }
    public static void fillAction(WebElement elem,String text){
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(text);
    }
    public static String getText(WebElement elem){
        waitForPageLoad();
        wait.until(ExpectedConditions.visibilityOf(elem));
        return elem.getText();
    }
    public static Boolean isElementVisible(WebElement elem){
        waitForPageLoad();
        try {
            wait.until(ExpectedConditions.visibilityOf(elem));
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }
    public static void waitForPageLoad() {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }


}
