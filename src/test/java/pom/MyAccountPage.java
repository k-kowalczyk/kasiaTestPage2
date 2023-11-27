package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

    private WebDriver driver;
    @FindBy(className = "woocommerce-MyAccount-content")
    public WebElement welcomeText;

    public MyAccountPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(this.driver, this);
    }

    public String getWelcomeText() {
        return welcomeText.getText();
    }
}
