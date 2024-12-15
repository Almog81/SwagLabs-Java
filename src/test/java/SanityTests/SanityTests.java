package SanityTests;
import Utilities.CommonOps;
import Utilities.ManageDDT;
import WorkFlows.WebFlow;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class SanityTests extends CommonOps {

    @Test(dataProvider = "loginData", dataProviderClass = ManageDDT.class)
    public void test01_Login(JSONObject testData) {
        String email = ManageDDT.getDataFromJSON(testData, "email");
        String password = ManageDDT.getDataFromJSON(testData, "password");
        String expectedName = ManageDDT.getDataFromJSON(testData, "expectedName");
        
        WebFlow.naviToHomePage();
        WebFlow.loginAction(email, password);
        WebFlow.verifyTextInElement(LumaHomePage.elm_loggedIn, "Welcome, " + expectedName + "!");
    }

    @Test(dataProvider = "createAccountData", dataProviderClass = ManageDDT.class)
    public void test02_CreateAccount(JSONObject testData) {
        String firstname = ManageDDT.getDataFromJSON(testData, "firstname");
        String lastname = ManageDDT.getDataFromJSON(testData, "lastname");
        String email = ManageDDT.getDataFromJSON(testData, "email");
        String password = ManageDDT.getDataFromJSON(testData, "password");
        
        WebFlow.naviToHomePage();
        WebFlow.CreateAccountAction(firstname, lastname, email, password);
        WebFlow.verifyElementVisible(LumaCreateAccountPage.elm_messageSuccess);
    }
}
