package Utilities;

import io.appium.java_client.android.AndroidDriver;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class MobileCommonOps extends Base{

    //Before test
    @BeforeClass
    public void StartSession() throws MalformedURLException {
        DesiredCapabilities caps = initMobileDevise("device1");
        URL url = new URL(appiumUrl);
        driver = new AndroidDriver(url, caps);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        ManagePages.initPages();
    }

    //After test
    @AfterClass
    public void CloseSession() {
        driver.quit();
    }

    //functions

    static DesiredCapabilities initMobileDevise(String deviceName) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(DDT_PATH + "MobileDevices.json"));
            JSONObject devicesObject = (JSONObject) jsonObject.get("devices");
            JSONObject deviceConfig = (JSONObject) devicesObject.get(deviceName);

            if (deviceConfig == null) {
                throw new RuntimeException("Device " + deviceName + " not found in JSON configuration.");
            }

            DesiredCapabilities caps = new DesiredCapabilities();
            for (Object key : deviceConfig.keySet()) {
                String capabilityKey = (String) key;
                Object capabilityValue = deviceConfig.get(capabilityKey);
                caps.setCapability(capabilityKey, capabilityValue);
            }

            return caps;
        } catch (IOException | ParseException e) {
            throw new RuntimeException("Error reading JSON file: " + e.getMessage());
        }
    }

}
