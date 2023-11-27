package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage {

    private final WebDriver driver;

    @FindBy(css = "a[href='https://epakiet.com/index.php/sklep/'")
    private WebElement shopLink;

    @FindBy(css = "a[href='https://epakiet.com/index.php/moje-konto/']")
    private WebElement loginLink;
    @FindBy(id = "wp-block-search__input-5")
    private WebElement searchLink;

    @FindBy(className = "wp-block-search__button")
    private WebElement searchButton;

    @FindBy(css = "a[href='https://epakiet.com/index.php/kontakt/']")
    private WebElement contactPageLink;

    public StartPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(this.driver, this);
    }

    public ShopPage goToShopPage() {
        shopLink.click();
        return new ShopPage(driver);
    }

    public LoginRegistrationPage goToLoginRegistrationPage() {
        loginLink.click();
        return new LoginRegistrationPage(driver);
    }

    public void setSearchField(String searchText) {
        searchLink.sendKeys(searchText);
    }

    public SearchPage goToSearchPage() {
        searchButton.click();
        return new SearchPage(driver);
    }

    public ContactPage goToContactPage() {
        contactPageLink.click();
        return new ContactPage(driver);
    }
}

