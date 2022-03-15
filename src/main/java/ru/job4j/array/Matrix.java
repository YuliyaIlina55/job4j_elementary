package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] pifagor = new int[size][size];
        for (int i = 0; i < pifagor.length; i++) {
            for (int j = 0; j < pifagor[i].length; j++) {
                pifagor[i][j] = (i + 1) * (j + 1);
            }
        }
        return pifagor;
    }
}

