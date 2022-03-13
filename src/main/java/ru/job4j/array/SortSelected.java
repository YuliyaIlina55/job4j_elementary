package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapason.findMin(data, i + 1, data.length - 1);
            int index = FindLoop.indexOf2(data, min, i + 1, data.length - 1);
            if (i != index) {
                SwitchArray.swap(data, index - i, i);
            }

        }
        return data;
    }
}
