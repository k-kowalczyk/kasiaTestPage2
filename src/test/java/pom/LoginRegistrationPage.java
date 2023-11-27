package pom;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginRegistrationPage {
    private WebDriver driver;
    @FindBy(name = "username")
    private WebElement usernameField;
    @FindBy(name = "password")
    private WebElement passwordField;
    @FindBy(name = "login")
    private WebElement logInButton;
    @FindBy(id = "reg_email")
    private WebElement getEmailField;
    @FindBy(className = "woocommerce-form-register__submit")
    private WebElement RegistrationEmailField;
    @FindBy(className = "woocommerce-form-register__submit")
    private WebElement registerButton;

    public LoginRegistrationPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(this.driver, this);
    }

    public void setUsernameField(String username) {
        usernameField.sendKeys(username);
    }

    public void setPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public MyAccountPage logIn() {
        logInButton.click();
        return new MyAccountPage(driver);
    }

    public void setRegistrationEmailField(String email) {
        getEmailField.sendKeys(email);
    }

    public MyAccountPage Register() {
        registerButton.click();
        return new MyAccountPage(driver);
    }
}
