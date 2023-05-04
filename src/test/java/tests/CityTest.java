package tests;

import helpers.CountryListPage;
import helpers.DefaultPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.ChoiceCity;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

@Tag("project")
public class CityTest extends TestBase {

    DefaultPage defaultPage = new DefaultPage();
    CountryListPage countryListPage = new CountryListPage();
    RandomData randomData = new RandomData();

    @Test
    public void incorrectCity() {

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        step("select incorrect Town" + randomData.incorrectTown, () -> {
            countryListPage.chooseCity(randomData.incorrectTown);
        });
        step("check incorrect Town", () -> {
            countryListPage.checkIncorrectTown();
        });
    }

    @Test
    public void changeCity() {
        String randomCity = ChoiceCity.randomCity().getCity();

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        step("select correct City" + randomCity, () -> {
            countryListPage.chooseCity(randomCity);
        });
        step("change City", () -> {
            countryListPage.changeCity();
        });
        step("select another City" + randomData.town, () -> {
            countryListPage.chooseCity(randomData.town);
        });
        step("check City" + randomData.town, () -> {
            countryListPage.checkCity(randomData.town);
        });
    }
}
