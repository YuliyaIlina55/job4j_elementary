package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float euroToRuble(float rsl) {
        float value = rsl * 70;
        return value;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRuble(float rsl) {
        float value = rsl * 60;
        return value;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(360);
        System.out.println("360 rubles are " + dollar + " dollar.");
        float ruble = Converter.euroToRuble(12);
        System.out.println("12 euros are " + ruble + " ruble.");
        float ruble1 = Converter.dollarToRuble(6);
        System.out.println("6 dollars are " + ruble1 + " ruble.");
    }
}
