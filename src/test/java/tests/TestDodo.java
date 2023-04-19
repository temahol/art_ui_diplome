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
}