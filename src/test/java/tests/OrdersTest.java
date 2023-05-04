package tests;

import helpers.BasketPage;
import helpers.CountryListPage;
import helpers.DefaultPage;
import helpers.OrderPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.ChoiceSnack;
import utils.ChoiceThirdPizza;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

@Tag("project")
public class OrdersTest extends TestBase {

    DefaultPage defaultPage = new DefaultPage();
    CountryListPage countryListPage = new CountryListPage();
    OrderPage orderPage = new OrderPage();
    BasketPage basketPage = new BasketPage();
    RandomData randomData = new RandomData();

    @Test
    public void choose3Pizza() {
        String randomThirdPizza = ChoiceThirdPizza.randomPizza().getPizza();

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            countryListPage.chooseCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            countryListPage.checkCity(randomData.city);
        });
        step("select first pizza" + randomData.firstPizza, () -> {
            orderPage.selectFood(randomData.firstPizza);
        });
        step("select second pizza" + randomData.secondPizza, () -> {
            orderPage.selectFood(randomData.secondPizza);
        });
        step("select third pizza" + randomThirdPizza, () -> {
            orderPage.selectFood(randomThirdPizza);
        });
        step("select Basket", () -> {
            basketPage.selectBasket();
        });
        step("check first Pizza" + randomData.firstPizza, () -> {
            basketPage.checkBasket(randomData.firstPizza);
        });
        step("check second Pizza" + randomData.secondPizza, () -> {
            basketPage.checkBasket(randomData.secondPizza);
        });
        step("check third Pizza" + randomThirdPizza, () -> {
            basketPage.checkBasket(randomThirdPizza);
        });
    }

    @Test
    public void chooseSnack() {
        String randomSnack = ChoiceSnack.randomSnack().getSnack();

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            countryListPage.chooseCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            countryListPage.checkCity(randomData.city);
        });
        step("select item from header menu" + randomSnack, () -> {
            orderPage.selectHeaderTab(randomSnack);
        });
        step("add shack to Basket" + randomSnack, () -> {
            basketPage.addToBasket(randomSnack);
        });
        step("select Basket", () -> {
            basketPage.selectBasket();
        });
        step("check snack" + randomSnack, () -> {
            basketPage.checkBasket(randomSnack);
        });
    }

    @Test
    public void chooseCookie() {

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            countryListPage.chooseCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            countryListPage.checkCity(randomData.city);
        });
        step("select item from header menu" + randomData.cookies, () -> {
            orderPage.selectHeaderTab(randomData.cookies);
        });
        step("add cookie to Basket" + randomData.cookie, () -> {
            basketPage.addToBasket(randomData.cookie);
        });
        step("select Basket", () -> {
            basketPage.selectBasket();
        });
        step("check cookie" + randomData.cookie, () -> {
            basketPage.checkBasket(randomData.cookie);
        });
    }

    @Test
    public void choosePizzaSize() {

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            countryListPage.chooseCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            countryListPage.checkCity(randomData.city);
        });
        step("select pizza with options" + randomData.firstPizza + randomData.pizzaSize + randomData.dough, () -> {
            orderPage.selectPizzaWithOptions(randomData.firstPizza, randomData.pizzaSize, randomData.dough);
        });
    }

}
