package SanityTests;
import Utilities.CommonOps;
import Utilities.ManageDDT;
import WorkFlows.WebFlow;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class SanityTests extends CommonOps {

    @Test(dataProvider = "loginData", dataProviderClass = ManageDDT.class)
    public void test01_Login(JSONObject testData) {
        WebFlow.naviToHomePage();
        WebFlow.loginAction(testData);
        WebFlow.verifyElementVisible(ParaHomePage.signOut);
        WebFlow.signOutAction();
    }

    @Test(dataProvider = "createAccountData", dataProviderClass = ManageDDT.class)
    public void test02_CreateAccount(JSONObject testData) {
        WebFlow.naviToHomePage();
        WebFlow.CreateAccountAction(testData);
        WebFlow.verifyElementVisible(ParaCreateAccountPage.elm_messageSuccess);
        WebFlow.signOutAction();
    }
}
