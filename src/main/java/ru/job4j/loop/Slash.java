package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int raw = 0; raw < size; raw++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = raw == cell;
                boolean right = (raw + cell) % 2 == 0 && cell == size - 1 - raw;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}
