package SanityTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SanityMobileTest {

    private AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Desired capabilities for Android
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("appium:platformVersion", "9");
        caps.setCapability("appium:UDID", "faab4e1b");
        caps.setCapability("appium:automationName", "UiAutomator2");
        caps.setCapability("appium:appPackage", "com.swaglabsmobileapp");
        caps.setCapability("appium:appActivity", ".MainActivity");
        caps.setCapability("appium:appWaitActivity", "*");

        // URL to Appium server (ensure Appium is running on port 4723)
        URL url = new URL("http://127.0.0.1:4723/");

        // Initialize the driver with desired capabilities
        driver = new AndroidDriver(url, caps);
    }

    @Test
    public void testLogin() {
        // Use WebDriverWait to wait for elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate and interact with username field
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]")));
        usernameField.sendKeys("standard_user");

        // Locate and interact with password field
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]")));
        passwordField.sendKeys("secret_sauce");

        // Locate and click on the login button
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"LOGIN\"]")));
        loginButton.click();
    }
}
