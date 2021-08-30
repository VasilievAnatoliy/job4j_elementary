package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (true) {
            amount = amount * (percent / 100) + amount - salary;
            year++;
            if (amount < 0) {
                break;
            }
        }
        return year;
    }
}
