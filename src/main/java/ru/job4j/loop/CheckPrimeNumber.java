package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return number > 1;
    }

}

