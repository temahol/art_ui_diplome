package config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriverProvider {

    private MobileConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        createWebDriver();
    }

    private void createWebDriver() {
        switch (config.getBrowser().toLowerCase()) {
            case "chrome":
                Configuration.browser = "chrome";
                break;
            case "firefox":
                Configuration.browser = "firefox";
                break;
            default:
                throw new RuntimeException(config.getBrowser());
        }

        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowser();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.remote = config.getRemoteUrl();
        Configuration.browserSize = config.getBrowserSize();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

//        Configuration.browserCapabilities = capabilities;
    }
}
