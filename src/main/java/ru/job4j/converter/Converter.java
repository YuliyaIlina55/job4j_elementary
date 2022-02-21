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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);
        float in1 = 360;
        float expected1 = 6;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("360 rubles are 6. Test result: " + passed1);
        float in2 = 12;
        float expected2 = 840;
        float out2 = Converter.euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("12 euros are 840. Test result: " + passed2);
        float in3 = 6;
        float expected3 = 360;
        float out3 = Converter.dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("6 dollars are 360. Test result: " + passed3);
    }
}
