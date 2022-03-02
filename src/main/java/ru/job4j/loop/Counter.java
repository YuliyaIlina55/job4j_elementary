package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (start = start, finish = finish; start <= finish; start++) {
            sum = sum + start;
        }
        return sum;
      }

    public static void main(String[] args) {
        System.out.println(Counter.sum(0, 10));
        System.out.println(Counter.sum(3, 8));
        System.out.println(Counter.sum(1, 1));
        System.out.println(Counter.sum(1, 3));
    }
}