package utils;

import java.util.concurrent.ThreadLocalRandom;

public enum ChoiceThirdPizza {

            FRESH("Пепперони фреш"),
            MEET("Ветчина и сыр"),
            CHORIZO("Чоризо фреш");

    private final String pizza;

    public static ChoiceThirdPizza randomPizza() {
        ChoiceThirdPizza[] directions = values();
        return directions[ThreadLocalRandom.current().nextInt(directions.length)];
    }

    ChoiceThirdPizza(String pizza) {
        this.pizza = pizza;
    }

    public String getPizza() {
        return pizza;
    }
}
