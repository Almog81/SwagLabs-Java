package SanityTests;
import Utilities.ManageDDT;
import Utilities.MobileCommonOps;
import WorkFlows.MobileFlow;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class SanityMobileTests extends MobileCommonOps {


    @Test(dataProvider = "loginData", dataProviderClass = ManageDDT.class)
    public void test01_Login(JSONObject testData) {
        MobileFlow.loginAction(testData);
    }
    @Test
    public void test02_addToCart(){
        MobileFlow.safeLoginAction();
    }
}
