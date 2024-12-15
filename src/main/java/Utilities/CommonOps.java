package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;


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

    protected static Object[][] getDataFromJson(String filePath) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(filePath));
            JSONArray testsArray = (JSONArray) jsonObject.get("tests");
            
            Object[][] data = new Object[testsArray.size()][1];
            for (int i = 0; i < testsArray.size(); i++) {
                data[i][0] = testsArray.get(i);
            }
            return data;
        } catch (IOException | ParseException e) {
            throw new RuntimeException("Error reading JSON file: " + e.getMessage());
        }
    }
}
