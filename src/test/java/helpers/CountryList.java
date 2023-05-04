package helpers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CountryList {

    private SelenideElement
            selectCity = $("[placeholder='Поиск...']"),
            modalTownsChoose = $(".locality-selector-popup"),
            checkCity = $("a.header__about-slogan-text");

    public CountryList chooseCity(String value) {
        selectCity.setValue(value).pressEnter();
        return this;
    }

    public CountryList checkCity(String value) {
        checkCity.shouldHave(text(value));
        return this;
    }

    public CountryList checkIncorrectTown() {
        modalTownsChoose.shouldHave(text("Пиццерия в этом городе еще не открылась"));
        return this;
    }

    public CountryList changeCity() {
        $("a.about-slogan-text_link").pressEnter();
        return this;
    }
}
