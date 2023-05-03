package helpers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BasketPage {

    private SelenideElement
            basket = $("button[data-testid=navigation__cart]"),
            basketCheck = $(".undefined__view");


    public BasketPage selectBasket() {
        basket.click();
        return this;
    }

    public BasketPage checkBasket(String value) {
        basketCheck.shouldHave(text(value));
        return this;
    }

    public BasketPage addToBasket(String value) {
        $(byText(value)).click();
        $(byXpath("//button[@class='sc-1rmt3mq-0 cpUbDl sc-18frhrp-3 guiMAG']")).click();
        return this;
    }
}
