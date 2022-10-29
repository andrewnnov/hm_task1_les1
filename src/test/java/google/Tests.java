package google;

import google.pages.AfterSearchGooglePage;
import google.pages.MainGooglePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests extends BaseTest {

    @Test
    public void firstTest() {
        chromeDriver.get("https://www.google.com");
        MainGooglePage mainGooglePage = new MainGooglePage(chromeDriver);
        mainGooglePage.find("Гладиолус");

        AfterSearchGooglePage afterSearchGooglePage = new AfterSearchGooglePage(chromeDriver);
        Assertions.assertTrue(afterSearchGooglePage.getResultSearch().stream().anyMatch(x->x.getText()
                .contains("wikipedia.org")), "В результатах поиска нет сайта википедии");
    }
}
