package Utilities;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;

public class ManageDDT extends CommonOps {
    
    private static final String DDT_PATH = "src/main/java/DDT/";

    @DataProvider(name = "loginData")
    public static Object[][] getLoginData() {
        return getDataFromJson(DDT_PATH + "LoginData.json");
    }

    @DataProvider(name = "createAccountData")
    public static Object[][] getCreateAccountData() {
        return getDataFromJson(DDT_PATH + "CreateAccountData.json");
    }

    public static String getDataFromJSON(JSONObject json, String key) {
        try {
            return (String) json.get(key);
        } catch (Exception e) {
            throw new RuntimeException("Error reading key '" + key + "' from JSON: " + e.getMessage());
        }
    }
} 