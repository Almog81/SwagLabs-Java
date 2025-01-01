package SanityTests;
import Utilities.ManageDDT;
import Utilities.MobileCommonOps;
import WorkFlows.MobileFlow;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class SanityMobileTest extends MobileCommonOps {



    @Test(dataProvider = "loginData", dataProviderClass = ManageDDT.class)
    public void test01_Login(JSONObject testData) {
        MobileFlow.loginAction(testData);

    }
}
