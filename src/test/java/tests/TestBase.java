package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Elements;
import helpers.Pages;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import utils.AttachmentsTest;
import utils.RandomData;

import static com.codeborne.selenide.Selenide.webdriver;
import static io.qameta.allure.Allure.attachment;

public class TestBase {

    Pages pages = new Pages();
    Elements elements = new Elements();
    RandomData randomData = new RandomData();

    public static String env = System.getProperty("env");

    @BeforeAll
    public static void setUp() {
        WebDriverProvider.createWebDriver();
    }

    @BeforeEach
   public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

    }

    @AfterEach
    void addAttachments() {
        AttachmentsTest.browserConsoleLogs();
        AttachmentsTest.screenAttach();
        attachment("Source", webdriver().driver().source());
        switch (env) {
            case "remote":
                AttachmentsTest.addVideo();
                break;
        }
    }

}
