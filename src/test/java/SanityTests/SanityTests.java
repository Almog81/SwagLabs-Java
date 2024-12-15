package SanityTests;
import Utilities.CommonOps;
import WorkFlows.WebFlow;
import org.testng.annotations.Test;

public class SanityTests extends CommonOps {

    @Test
    public void test01_Login() {
        String email =  "user4Test@example.com";
        String password = "!@userPassword1234";
        String name = "Sam One";
        WebFlow.naviToHomePage();
        WebFlow.loginAction(email, password);
        WebFlow.verifyTextInElement(LumaHomePage.elm_loggedIn, "Welcome, " + name +"!");
    }

    @Test
    public void test02_CreateAccount() {
        String firstname =  "Sam";
        String lastname = "One";
        String email = "user4Test124@example.com";
        String password = "!@userPassword1234";
        WebFlow.naviToHomePage();
        WebFlow.CreateAccountAction(firstname,lastname,email, password);
        WebFlow.verifyElementVisible(LumaCreateAccountPage.elm_messageSuccess);
    }

}
