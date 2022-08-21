package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest extends BaseTest{


    @Test
    public void validRegisterTest(){
        homePage.clickAccountLink();
        registerPage.clickRegisterLink();
        registerPage.setFirstNameBox();
        registerPage.setMiddlenameBox();
        registerPage.setMiddlenameBox();
        registerPage.setEmailAddressBox();
        registerPage.setPasswordBox();
        registerPage.setConfirmationPasswordBox();
        registerPage.clickSubscribeButton();
        registerPage.clickFinalRegisterButton();


    }
}
