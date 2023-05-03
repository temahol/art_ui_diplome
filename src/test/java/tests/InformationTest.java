package tests;

import helpers.AboutUsPage;
import helpers.CountryList;
import helpers.DefaultPage;
import helpers.OrderPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.RandomData;

import static io.qameta.allure.Allure.step;

@Tag("project")
public class InformationTest extends TestBase {


    DefaultPage defaultPage = new DefaultPage();
    CountryList countryList = new CountryList();
    OrderPage orderPage = new OrderPage();
    RandomData randomData = new RandomData();
    AboutUsPage aboutUsPage = new AboutUsPage();

    @Test
    public void aboutUs() {

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
            orderPage.selectHeaderTab(randomData.aboutUs);
        });
        step("check About Us", () -> {
            aboutUsPage.checkAboutUS();
        });
    }
}
