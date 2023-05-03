package helpers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AboutUsPage {

    private SelenideElement
            aboutCheck = $(".container");

    public AboutUsPage checkAboutUS() {
        aboutCheck.shouldHave(text("Мы"));
        return this;
    }
}
