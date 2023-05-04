package tests;

import helpers.CoinsPage;
import helpers.CountryListPage;
import helpers.DefaultPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

@Tag("project")
public class CoinsTest extends TestBase {

    DefaultPage defaultPage = new DefaultPage();
    CountryListPage countryListPage = new CountryListPage();
    CoinsPage coinsPage = new CoinsPage();
    RandomData randomData = new RandomData();

    @Test
    public void dodoCoins() {

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
            coinsPage.selectCoins();
        });
        step("check dodoCoins", () -> {
            coinsPage.checkCoins();
        });
    }
}
