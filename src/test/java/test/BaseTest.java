package test;

import org.checkerframework.checker.units.qual.C;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;

public class BaseTest {
    public String userEmail = "mesebogdan@yahoo.com";
    public String userPass = "12345P!";
    public String userName = "Mesesan Bogdan Cornel";

    // driver
    public WebDriver driver;
    // page objects
    public HomePage homePage;
    public LoginPage loginPage;
    public AccountPage accountPage;
    public SearchResultsPage searchResultsPage;
    public ProductPage productPage;
    public CartPage cartPage;

    @Before

    public void initDriver() {
        // init driver
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //init page objects
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);

        // navigate to homepage
        driver.get("http://testfasttrackit.info/selenium-test");
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void closeDriver() {
        driver.quit();
    }

}
