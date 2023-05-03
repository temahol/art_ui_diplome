package helpers;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class OrderPage {

    private SelenideElement
    addToOrder = $("button[data-testid=button_add_to_cart]");


    public OrderPage selectFood(String value) {
        $(byText(value)).click();
        addToOrder.click();
        return this;
    }

    public OrderPage selectHeaderTab(String value) {
        $(".grid").$(byText(value)).click();
        return this;
    }

    public OrderPage selectPizzaWithOptions(String value, Integer a, String b) {
        $(byText(value)).click();
        $("label[data-testid=menu__pizza_size_" + a + "]").click();
        $(byXpath("//label[text()='" + b + "']")).click();
        addToOrder.click();
        return this;
    }
}
