package test;

import org.junit.Test;

public class CheckoutTest extends BaseTest {


    @Test
    public void validCheckoutTest() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField("cosmin@fasttrackit.org");
        loginPage.setPasswordField("123456");
        loginPage.clickLoginButton();
    }
}
