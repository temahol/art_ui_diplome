package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TestDodo extends TestBase {

    @Test
    @Tag("project")
    public void incorrectCity() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open the main page of DoDo", () -> {
            pages.openPage();
        });
        step("select incorrect Town" + randomData.incorrectTown, () -> {
            elements.choozeCity(randomData.incorrectTown);
        });
        step("check incorrect Town", () -> {
            elements.checkIncorrectTown();
        });
    }

    @Test
    @Tag("project")
    public void changeCity() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open the main page of DoDo", () -> {
            pages.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            elements.choozeCity(randomData.city);
        });
        step("change City", () -> {
            elements.changeCity();
        });
        step("select another City" + randomData.town, () -> {
            elements.choozeCity(randomData.town);
        });
        step("check City" + randomData.town, () -> {
            elements.checkCity(randomData.town);
        });
    }

    @Test
    @Tag("project")
    public void choose3Pizza() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open the main page of DoDo", () -> {
            pages.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            elements.choozeCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            elements.checkCity(randomData.city);
        });
        step("select first pizza" + randomData.firstPizza, () -> {
            elements.selectFood(randomData.firstPizza);
        });
        step("select second pizza" + randomData.secondPizza, () -> {
            elements.selectFood(randomData.secondPizza);
        });
        step("select third pizza" + randomData.thirdPizza, () -> {
            elements.selectFood(randomData.thirdPizza);
        });
        step("select Basket", () -> {
            elements.selectBasket();
        });
        step("check first Pizza" + randomData.firstPizza, () -> {
            elements.checkBasket(randomData.firstPizza);
        });
        step("check second Pizza" + randomData.secondPizza, () -> {
            elements.checkBasket(randomData.secondPizza);
        });
        step("check third Pizza" + randomData.thirdPizza, () -> {
            elements.checkBasket(randomData.thirdPizza);
        });
    }

    @Test
    @Tag("project")
    public void chooseSnack() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open the main page of DoDo", () -> {
            pages.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            elements.choozeCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            elements.checkCity(randomData.city);
        });
        step("select item from header menu" + randomData.snacks, () -> {
            elements.selectHeaderTab(randomData.snacks);
        });
        step("add shack to Basket" + randomData.snack, () -> {
            elements.addToBasket(randomData.snack);
        });
        step("select Basket", () -> {
            elements.selectBasket();
        });
        step("check snack" + randomData.snack, () -> {
            elements.checkBasket(randomData.snack);
        });
    }

    @Test
    @Tag("project")
    public void chooseCookie() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open the main page of DoDo", () -> {
            pages.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            elements.choozeCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            elements.checkCity(randomData.city);
        });
        step("select item from header menu" + randomData.cookies, () -> {
            elements.selectHeaderTab(randomData.cookies);
        });
        step("add cookie to Basket" + randomData.cookie, () -> {
            elements.addToBasket(randomData.cookie);
        });
        step("select Basket", () -> {
            elements.selectBasket();
        });
        step("check cookie" + randomData.cookie, () -> {
            elements.checkBasket(randomData.cookie);
        });
    }

    @Test
    @Tag("project")
    public void choosePizzaSize() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open the main page of DoDo", () -> {
            pages.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            elements.choozeCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            elements.checkCity(randomData.city);
        });
        step("select pizza with options" + randomData.firstPizza + randomData.pizzaSize + randomData.dough, () -> {
            elements.selectPizzaWithOptions(randomData.firstPizza, randomData.pizzaSize, randomData.dough);
        });
    }

    @Test
    @Tag("project")
    public void aboutUs() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open the main page of DoDo", () -> {
            pages.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            elements.choozeCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            elements.checkCity(randomData.city);
        });
        step("select item from header menu" + randomData.cookies, () -> {
            elements.selectHeaderTab(randomData.aboutUs);
        });
        step("check About Us", () -> {
            elements.checkAboutUS();
        });
    }

    @Test
    @Tag("project")
    public void dodoCoins() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        step("Open the main page of DoDo", () -> {
            pages.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            elements.choozeCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            elements.checkCity(randomData.city);
        });
        step("select item from header menu" + randomData.cookies, () -> {
            elements.selectCoins();
        });
        step("check dodoCoins", () -> {
            elements.checkCoins();
        });
    }
}