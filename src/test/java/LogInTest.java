import org.testng.Assert;
import org.testng.annotations.Test;
import pom.LoginRegistrationPage;
import pom.MyAccountPage;
import pom.StartPage;
import util.PageDriverUtil;

public class LogInTest extends PageDriverUtil {

    @Test
    public void LoginTest() {

        String userName = "katarzyna.kowalczyk";
        String login = "katarzyna.kowalczyk@susek.info";
        StartPage startPage = new StartPage(driver);
        LoginRegistrationPage loginRegistrationPage = startPage.goToLoginRegistrationPage();

        loginRegistrationPage.setUsernameField(login);
        loginRegistrationPage.setPasswordField("hasloTestowe");
        MyAccountPage myAccountPage = loginRegistrationPage.logIn();

        String resultText = myAccountPage.getWelcomeText();
        Assert.assertTrue(resultText.contains(userName));
    }
}
