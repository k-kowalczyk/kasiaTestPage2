package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage {

    private WebDriver driver;

    @FindBy(css = ".wp-block-query>ul li")
    private List<WebElement> resultLink;


    public SearchPage(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(this.driver, this);
    }

    public int getSearchingResultListSize() {
        return resultLink.size();
    }


}
