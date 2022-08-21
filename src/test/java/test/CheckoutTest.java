package test;

import org.junit.Test;

public class CheckoutTest extends BaseTest {


    @Test
    public void validCheckoutTest() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(userEmail);
        loginPage.setPasswordField(userPass);
        loginPage.clickLoginButton();



    }
}
