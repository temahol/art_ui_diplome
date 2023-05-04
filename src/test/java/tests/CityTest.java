package tests;

import helpers.CountryList;
import helpers.DefaultPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.ChoiceCity;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

@Tag("project")
public class CityTest extends TestBase {

    DefaultPage defaultPage = new DefaultPage();
    CountryList countryList = new CountryList();
    RandomData randomData = new RandomData();

    @Test
    public void incorrectCity() {

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        step("select incorrect Town" + randomData.incorrectTown, () -> {
            countryList.chooseCity(randomData.incorrectTown);
        });
        step("check incorrect Town", () -> {
            countryList.checkIncorrectTown();
        });
    }

    @Test
    public void changeCity() {

        step("Open the main page of DoDo", () -> {
            defaultPage.openPage();
        });
        String randomCity = ChoiceCity.randomCity().getCity();
        step("select correct City" + randomCity, () -> {
            countryList.chooseCity(randomCity);
        });
        step("change City", () -> {
            countryList.changeCity();
        });
        step("select another City" + randomData.town, () -> {
            countryList.chooseCity(randomData.town);
        });
        step("check City" + randomData.town, () -> {
            countryList.checkCity(randomData.town);
        });
    }
}
