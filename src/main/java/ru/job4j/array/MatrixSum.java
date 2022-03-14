package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rst = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rst += array[row][cell];
            }
        }
        return rst;
    }
}
