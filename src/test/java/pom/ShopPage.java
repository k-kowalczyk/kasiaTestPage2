package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {

    private WebDriver driver;
    @FindBy(css = "a[href='https://epakiet.com/index.php/produkt/hat/'")
    private WebElement hatLink;

    public ShopPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(this.driver, this);
    }

    public ProductPage goToHatProduct() {
        hatLink.click();
        return new ProductPage(driver);
    }
}
