import org.testng.Assert;
import org.testng.annotations.Test;
import pom.LoginRegistrationPage;
import pom.MyAccountPage;
import pom.StartPage;
import util.PageDriverUtil;

public class RegistrationTest extends PageDriverUtil {


    @Test
    public void RegisterTest() {

        String userName = "kasia"+System.currentTimeMillis();
        String userMail = userName+"@example.com";

        StartPage startPage = new StartPage(driver);
        LoginRegistrationPage loginRegistrationPage = startPage.goToLoginRegistrationPage();

        loginRegistrationPage.setRegistrationEmailField(userMail);

        MyAccountPage myAccountPage = loginRegistrationPage.Register();
        String resultText = myAccountPage.getWelcomeText();
        Assert.assertTrue(resultText.contains(userName));
    }
}
