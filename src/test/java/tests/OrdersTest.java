package tests;

import helpers.BasketPage;
import helpers.CountryList;
import helpers.DefaultPage;
import helpers.OrderPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

@Tag("project")
public class OrdersTest extends TestBase {

    DefaultPage defaultPage = new DefaultPage();
    CountryList countryList = new CountryList();
    OrderPage orderPage = new OrderPage();
    BasketPage basketPage = new BasketPage();
    RandomData randomData = new RandomData();

    @Test
    public void choose3Pizza() {

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            countryList.chooseCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            countryList.checkCity(randomData.city);
        });
        step("select first pizza" + randomData.firstPizza, () -> {
            orderPage.selectFood(randomData.firstPizza);
        });
        step("select second pizza" + randomData.secondPizza, () -> {
            orderPage.selectFood(randomData.secondPizza);
        });
        step("select third pizza" + randomData.thirdPizza, () -> {
            orderPage.selectFood(randomData.thirdPizza);
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
        step("check third Pizza" + randomData.thirdPizza, () -> {
            basketPage.checkBasket(randomData.thirdPizza);
        });
    }

    @Test
    public void chooseSnack() {

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            countryList.chooseCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            countryList.checkCity(randomData.city);
        });
        step("select item from header menu" + randomData.snacks, () -> {
            orderPage.selectHeaderTab(randomData.snacks);
        });
        step("add shack to Basket" + randomData.snack, () -> {
            basketPage.addToBasket(randomData.snack);
        });
        step("select Basket", () -> {
            basketPage.selectBasket();
        });
        step("check snack" + randomData.snack, () -> {
            basketPage.checkBasket(randomData.snack);
        });
    }

    @Test
    public void chooseCookie() {

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        step("select correct City" + randomData.city, () -> {
            countryList.chooseCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            countryList.checkCity(randomData.city);
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
            countryList.chooseCity(randomData.city);
        });
        step("check City" + randomData.city, () -> {
            countryList.checkCity(randomData.city);
        });
        step("select pizza with options" + randomData.firstPizza + randomData.pizzaSize + randomData.dough, () -> {
            orderPage.selectPizzaWithOptions(randomData.firstPizza, randomData.pizzaSize, randomData.dough);
        });
    }

}
