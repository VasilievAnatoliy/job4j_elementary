package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int max(int left, int right, int first) {
        return max(max(left, right), first);
    }

    public static int max(int left, int right, int first, int second) {
        return max(max(left, right), max(first, second));
    }
}
