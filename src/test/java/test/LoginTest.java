package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import page.AccountPage;
import page.HomePage;
import page.LoginPage;

public class LoginTest {
    private WebDriver driver;
    private HomePage homepage;
    private LoginPage loginPage;
    private AccountPage accountPage;


    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homepage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        driver.get("http://testfasttrackit.info/selenium-test");
    }

    @Test
    public void validLoginTest(){
        homepage.clickAccountLink();
        homepage.clickLoginLink();
        loginPage.setEmailField("cosmin@fasttrackit.org");
        loginPage.setPasswordField("123456");
        loginPage.clickLoginButton();
        Assert.assertEquals("Hello, Cosmin Fast!", accountPage.getWelcomeText());
    }

    @Test
    public void changeLanguageTest(){
//        select-language
        Select selectLanguageDropdown = new Select(driver.findElement(By.id("select-language")));
        selectLanguageDropdown.selectByVisibleText("German");

    }

    @Test
    public void hoverOverCategoryTest(){
        Actions action = new Actions(driver);
        WebElement womenCategory = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent > a"));
        action.moveToElement(womenCategory).perform();
        WebElement viewAll = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent > ul > li.level1.view-all > a"));
        viewAll.click();

//        String random = RandomStringUtils.randomAlphanumeric(12);
//        String myEmail = random+"@testmail.com";
    }

    @After
    public void closeDriver(){
        driver.quit();
    }

}
