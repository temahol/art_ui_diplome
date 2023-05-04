package utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public enum ChoiceCity {

            MOSCOW ("Москва"),
            TAGAN ("Таганрог"),
            SPB ("Санкт-Петербург"),
            ABACAN ("Абакан");

    private final String city;

    public static ChoiceCity randomCity()  {
        ChoiceCity[] directions = values();
        return directions[ThreadLocalRandom.current().nextInt(directions.length)];
    }

    ChoiceCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
