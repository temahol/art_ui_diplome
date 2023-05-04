package utils;

import java.util.Random;

public enum ChoiceCity {

//    MOSCOW ("Москва"),
//    TAGAN ("Таганрог"),
//    SPB ("Санкт-Петербург"),
//    ABACAN ("Абакан");
    Town("Москва", "Таганрог", "Санкт-Петербург", "Абакан");

//    private final String town;

    private static final Random CITY = new Random();

    ChoiceCity(String москва, String таганрог, String s, String абакан) {
    }

    public static String randomCity()  {
        ChoiceCity[] directions = values();
        return String.valueOf(directions[CITY.nextInt(directions.length)]);
    }

//    ChoiceCity(String city) {
//        this.town = city;
//    }
}
