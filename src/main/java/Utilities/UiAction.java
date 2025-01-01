package Utilities;

import io.appium.java_client.android.AndroidDriver;
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
        if (driver instanceof AndroidDriver) {
            wait.until(driver -> ((AndroidDriver) driver).currentActivity() != null && !((AndroidDriver) driver).currentActivity().isEmpty());
        } else if (driver instanceof JavascriptExecutor) {
            wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                    .executeScript("return document.readyState").equals("complete"));
        }
    }


    public static boolean isImageDisplayed(WebElement imageElement) {
        waitForPageLoad();
        return isElementVisible(imageElement) && isImageSizeValid(imageElement) && isImageLoaded(imageElement);
    }

    private static boolean isImageSizeValid(WebElement imageElement) {
        int width = imageElement.getSize().getWidth();
        int height = imageElement.getSize().getHeight();

        if (width > 0 && height > 0) {
            return true;
        } else {
            System.out.println("Image dimensions are invalid: width=" + width + ", height=" + height);
            return false;
        }
    }

    private static boolean isImageLoaded(WebElement imageElement) {
        try {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            boolean isLoaded = (boolean) jsExecutor.executeScript(
                    "return arguments[0].complete && " +
                            "arguments[0].naturalWidth > 0 && " +
                            "arguments[0].naturalHeight > 0;",
                    imageElement
            );

            if (!isLoaded) {
                System.out.println("Image is not fully loaded.");
            }

            return isLoaded;
        } catch (Exception e) {
            System.out.println("Error while checking image load status: " + e.getMessage());
            return false;
        }
    }


}
