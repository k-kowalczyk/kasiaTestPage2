import org.testng.Assert;
import org.testng.annotations.Test;
import pom.BasketPage;
import pom.ProductPage;
import pom.ShopPage;
import pom.StartPage;
import util.PageDriverUtil;


public class AddToBasketTest extends PageDriverUtil {

    @Test
    public void BasketTest() throws InterruptedException {

        StartPage startPage = new StartPage(driver);

        ShopPage shopPage = startPage.goToShopPage();
        ProductPage productPage = shopPage.goToHatProduct();

        productPage.setProductQuantity(3);

        productPage.addToBasket();
        BasketPage basketPage = productPage.goToBasket();


        String quantity = basketPage.getQuantity();
        Assert.assertEquals(quantity, "31");
    }

}

