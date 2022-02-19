package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(4, 4, 2, 4);
        System.out.println("result (4, 4) to (2, 4) " + result);
        double result1 = Point.distance(3, 4, 1, 6);
        System.out.println("result (3, 4) to (1, 6) " + result1);
        double result2 = Point.distance(0, 1, 3, 8);
        System.out.println("result (0, 1) to (3, 8) " + result2);
    }
}
