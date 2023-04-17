package utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.openqa.selenium.logging.LogType.BROWSER;

public class AttachmentsTest {

    @Attachment(value = "scrinshot", type = "image/png", fileExtension = "png")
    public static byte[] screenAttach() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "{attachName}", type = "text/plain")
    public static String attachText(String attachName, String message) {
        return message;
    }

    public static void browserConsoleLogs() {
        attachText(
                "Browser Console logs",
                String.join("\n", Selenide.getWebDriverLogs(BROWSER))
        );
    }

    @Attachment(value = "video", type = "text/html", fileExtension = ".html")
    public static String addVideo() {
        return "<html><body><video width= '100%' height= '100%' controls autoplay><source src='"
                + getVideoUrl(getSessionId())
                + "' type='video/mp4'></video></body></html>";
    }

    public static URL getVideoUrl(String sessionId) {
        String videoUrl = "https://" + System.getProperty("remoteUrl", "selenoid.autotests.cloud/") + "video/" + sessionId + ".mp4";
        try {
            return new URL(videoUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getSessionId() {
        return ((RemoteWebDriver) getWebDriver()).getSessionId().toString();
    }
}
