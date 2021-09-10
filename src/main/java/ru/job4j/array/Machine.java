package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int index = 0;
        int out = money - price;
        do {
            while (out - coins[index] >= 0) {
                out -= coins[index];
                rsl[size] = coins[index];
                size++;
            }
            index++;
        } while (index < coins.length);
        return Arrays.copyOf(rsl, size);
    }
}
