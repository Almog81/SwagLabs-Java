package SanityTests;

import PageObjects.HomePage;
import Utilities.CommonOps;
import WorkFlows.WebFlow;
import org.testng.annotations.Test;

public class Test01 extends CommonOps {

    @Test
    public void test01_Login() throws InterruptedException {
        String user =  "user4Test@example.com";
        String pass = "userPassword";
        WebFlow.naviToHomePage();
        WebFlow.loginAction(user,pass);
//        WebFlow.verifyTextInElement(DemoBlazeHomePage.nameOfUser, "Welcome " + user);
    }
    @Test
    public void test02_createAccount() throws InterruptedException {
        WebFlow.naviToHomePage();
        WebFlow.createAccount("user4Test@example.com", "John", "Doe", "123456", "1", "January", "2000");
    }


}
