package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double result = amount + amount * (percent / 100);
        while (result - salary >= 0) {
            result = result * (percent / 100) + result - salary;
            year++;
           }
        return year;
    }
}
