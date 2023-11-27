package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    private WebDriver driver;
    @FindBy(className = "input-text")
    private WebElement productQuantityField;
    @FindBy(className = "single_add_to_cart_button")
    private WebElement basketButton;

    @FindBy(css = "a[href='https://epakiet.com/index.php/koszyk/")
    private WebElement basketLink;

    public ProductPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(this.driver, this);
    }

    public void setProductQuantity(int quantity) {
        productQuantityField.sendKeys(Integer.toString(quantity));
    }

    public void addToBasket() {
        basketButton.click();
    }

    public BasketPage goToBasket() {
        basketLink.click();
        return new BasketPage(driver);

    }
}
