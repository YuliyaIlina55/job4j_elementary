package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int j = 2; j <= number - 1; j++) {
            if (number % j == 0) {
                return false;
            }
            }
         return prime;
        }

    }

