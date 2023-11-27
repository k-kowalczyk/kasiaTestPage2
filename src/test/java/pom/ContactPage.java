package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactPage {

    private WebDriver driver;
    WebDriverWait wait;

    @FindBy(className = "wpcf7-form-control")
    private WebElement contactPageNameField;


    @FindBy(className = "wpcf7-email")
    private WebElement contactPageEmailField;

    @FindBy(name = "your-subject")
    private WebElement contactPageSubjectField;

    @FindBy(className = "wpcf7-textarea")
    private WebElement contactPageTextAreaField;

    @FindBy(className = "wpcf7-submit")
    private WebElement sendButton;

    @FindBy(className = "wpcf7-response-output")
    private WebElement welcomeText;

    public ContactPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setContactPageNameField(String name) {
        contactPageNameField.sendKeys(name);
    }

    public void setContactPageEmailField(String email) {
        contactPageEmailField.sendKeys(email);
    }

    public void setContactPageSubjectField(String subject) {
        contactPageSubjectField.sendKeys(subject);
    }

    public void setContactPageTextAreaField(String text) {
        contactPageTextAreaField.sendKeys(text);
    }

    public void sendButtonClick() {
        sendButton.click();
    }

    public String getWelcomeText() {

        wait.until(ExpectedConditions.visibilityOf(welcomeText));
        return welcomeText.getText();

    }


}
