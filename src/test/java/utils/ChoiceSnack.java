package utils;

import java.util.concurrent.ThreadLocalRandom;

public enum ChoiceSnack {

    SUPER("Супермясной Додстер"),
    SPYCI("Острый Додстер"),
    HOT("Додстер Карри");

    private final String snack;

    public static ChoiceSnack randomSnack() {
        ChoiceSnack[] directions = values();
        return directions[ThreadLocalRandom.current().nextInt(directions.length)];
    }

    ChoiceSnack(String snack) {
        this.snack = snack;
    }

    public String getSnack() {
        return snack;
    }
}
