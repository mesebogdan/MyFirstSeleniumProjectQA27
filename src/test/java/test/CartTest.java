package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.AccountPage;
import page.HomePage;
import page.LoginPage;

public class CartTest {
    // driver
    private WebDriver driver;
    // page objects
    private HomePage homepage;
    private LoginPage loginPage;


    @Before
    public void initDriver() {
        // init driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //init page objects
        homepage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        // navigate to homepage
        driver.get("http://testfasttrackit.info/selenium-test");
    }

    @Test
    public void addToCartTest() {
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField("cosmin@fasttrackit.org");
        loginPage.setPasswordField("123456");
        loginPage.clickLoginButton();
    }
}
