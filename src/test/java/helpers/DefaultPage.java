package helpers;

import static com.codeborne.selenide.Selenide.open;

public class DefaultPage {

    public DefaultPage openPage() {
        open("https://dodopizza.ru");
        return this;
    }
}
