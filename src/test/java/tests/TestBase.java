package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Elements;
import helpers.Pages;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.AttachmentsTest;
import utils.RandomData;

import java.util.Map;

import static com.codeborne.selenide.Selenide.webdriver;
import static io.qameta.allure.Allure.attachment;

public class TestBase {

    Pages pages = new Pages();
    Elements elements = new Elements();
    RandomData randomData = new RandomData();

    @BeforeAll
    static void beforeAll() {
        WebDriverProvider provider = new WebDriverProvider();

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

//        Configuration.baseUrl = "https://dodopizza.ru";
//        Configuration.browser = System.getProperty("browser", "chrome");
//        Configuration.browserVersion = System.getProperty("browser_version", "100.0");
//        Configuration.browserSize = System.getProperty("browser_size", "1920x1980");
//        Configuration.remote = System.getProperty("remote", "https://user1:1234@selenoid.autotests.cloud/wd/hub");

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
//                "enableVNC", true,
//                "enableVideo", true
//        ));
//        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void addAttachments() {
//        AttachmentsTest.browserConsoleLogs();
//        AttachmentsTest.addVideo();
//        AttachmentsTest.screenAttach();
//        attachment("Source", webdriver().driver().source());
    }

}
