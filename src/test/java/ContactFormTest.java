import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.ContactPage;
import pom.StartPage;
import util.PageDriverUtil;

import java.io.FileReader;
import java.io.IOException;

public class ContactFormTest extends PageDriverUtil {

    @Test
    public void ContactMultipleTimesTest() throws IOException, CsvValidationException {

        String name = "";
        String email = "";
        String subject = "";
        String text = "";

        CSVReader reader = new CSVReader(new FileReader("./src/test/java/data/contact.csv"));
        String[] nextLine;

        StartPage startPage = new StartPage(driver);
        startPage.goToContactPage();

        while ((nextLine = reader.readNext()) != null) {
            name = nextLine[0];
            email = nextLine[1];
            subject = nextLine[2];
            text = nextLine[3];

            ContactPage contactPage = new ContactPage(driver);

            contactPage.setContactPageNameField(name);
            contactPage.setContactPageEmailField(email);
            contactPage.setContactPageSubjectField(subject);
            contactPage.setContactPageTextAreaField(text);

            contactPage.sendButtonClick();

            String resultText = contactPage.getWelcomeText();
            Assert.assertTrue(resultText.contains("Twoja wiadomość została wysłana. Dziękujemy!"));
        }
    }
}


