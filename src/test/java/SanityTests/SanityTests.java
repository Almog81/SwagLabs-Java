package SanityTests;
import Utilities.CommonOps;
import WorkFlows.WebFlow;
import org.testng.annotations.Test;

public class SanityTests extends CommonOps {

    @Test
    public void test01_Login() {
        String user =  "user4Test";
        String pass = "!@userPassword1234";
        WebFlow.naviToHomePage();
        WebFlow.loginAction(user,pass);
        WebFlow.verifyTextInElement(QaHomePage.elm_userName, user);
    }


}
