package utils;

import java.util.Random;

public enum ChoiceCity {

            MOSCOW ("Москва"),
            TAGAN ("Таганрог"),
            SPB ("Санкт-Петербург"),
            ABACAN ("Абакан");

    private final String city;

    private static final Random CITY = new Random();

    public static String randomCity()  {
        ChoiceCity[] directions = values();
        return String.valueOf(directions[CITY.nextInt(directions.length)]);
    }

    ChoiceCity(String city) {
        this.city = city;
    }
}
