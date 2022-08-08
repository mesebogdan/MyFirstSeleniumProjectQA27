package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(css = "p.hello strong")
    private WebElement welcomeTextParagraph;

    public String getWelcomeText(){
        return welcomeTextParagraph.getText();
    }

}
