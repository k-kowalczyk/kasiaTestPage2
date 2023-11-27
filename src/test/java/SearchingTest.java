import org.testng.Assert;
import org.testng.annotations.Test;
import pom.SearchPage;
import pom.StartPage;
import util.PageDriverUtil;
public class SearchingTest extends PageDriverUtil {

    @Test
    public void SearchTest() {

        StartPage startPage = new StartPage(driver);
        startPage.setSearchField("Gutenberg");
        startPage.goToSearchPage();

        SearchPage searchPage = new SearchPage(driver);
        int resultListSize = searchPage.getSearchingResultListSize();

        Assert.assertEquals(resultListSize,3);
    }
}
