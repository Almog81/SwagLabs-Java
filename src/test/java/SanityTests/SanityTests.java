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
    }

    @Test
    public void test02_addToCart() {
        WebFlow.naviToHomePage();
        WebFlow.safeLoginAction();
        WebFlow.addToCartAction();
    }
}
