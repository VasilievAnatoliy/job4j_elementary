package ru.job4j.array;

public class PrintEvenElements {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int number = 0; number < numbers.length; number++) {
            if ((numbers.length - 1 - number) % 2 == 0) {
                System.out.println(
                        "Текущие элементы массива начиная с последнего, с четными индексами: "
                                + numbers[numbers.length - 1 - number]
                );
            }
        }
    }
}
