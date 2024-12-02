package SanityTests;


import Utilities.CommonOps;
import WorkFlows.WebFlow;
import org.testng.annotations.Test;

public class SanityTests extends CommonOps {

    @Test
    public void test01_Login() {
        String user =  "user4Test@example.com";
        String pass = "userPassword";
        WebFlow.naviToHomePage();
        WebFlow.loginAction(user,pass);
        WebFlow.verifyTextInElement(APHomePage.userinfo, "Sam One");
    }
    @Test
    public void test02_createAccount() {
        WebFlow.naviToHomePage();
        WebFlow.createAccount("userD34554Test@example.com", "John", "Doe", "123456", "1", "January", "2000");
    }


}
