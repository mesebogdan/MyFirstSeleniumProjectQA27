package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    // driver
    private WebDriver driver;
    // create driver in constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // web elements
    @FindBy(css = ".skip-account .label")
    private WebElement accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElement loginLink;


    // methods

    public void clickAccountLink(){
        accountLink.click();
    }

    public void clickLoginLink(){
        loginLink.click();
    }

}
