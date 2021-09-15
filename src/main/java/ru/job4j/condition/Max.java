package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int right, int first) {
        int max = left;
        if (right > max) {
            max = right;
        }
        if (first > max) {
            max = first;
        }
        return max;
    }

    public static int max(int left, int right, int first, int second) {
        int max = left;
        if (right > max) {
            max = right;
        }
        if (first > max) {
            max = first;
        }
        if (second > max) {
            max = second;
        }
        return max;
    }
}
