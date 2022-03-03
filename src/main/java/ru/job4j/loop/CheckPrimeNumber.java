package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int j = 2; j <= number; j++) {
            if (number % 2 == 0 || number % number - 1 == 0) {
                break;
            }
            return prime;
        }
        return false;
    }
}
