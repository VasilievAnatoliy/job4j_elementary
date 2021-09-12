package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int number = 0; number < numbers.length; number++) {
            System.out.println(
                    "Размер " + (number + 1) + " вложенного массива равен: " + numbers[number].length
            );
        }
    }
}
