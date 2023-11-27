package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketPage {

    private WebDriver driver;
    @FindBy(className = "qty")
    private WebElement quantityField;

    public BasketPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(this.driver, this);
    }

    public String getQuantity() {
        return quantityField.getAttribute("value");
    }
}
