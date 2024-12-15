package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;


public class CommonOps extends Base {

    @BeforeClass
    public void StartSession (){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        ManagePages.initPages();
    }


    @AfterClass
    public void CloseSession() {
        driver.quit();
    }
}
