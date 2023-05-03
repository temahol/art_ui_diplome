package helpers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CoinsPage {

    private SelenideElement
            checkDodoCoins = $(".applink"),
            selectCoins = $("a.sc-2c0aw7-0");

    public CoinsPage selectCoins() {
        selectCoins.pressEnter();
        return this;
    }

    public CoinsPage checkCoins() {
        checkDodoCoins.shouldHave(text("Скачать приложение по QR-коду"));
        return this;
    }
}
