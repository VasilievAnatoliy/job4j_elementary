package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 0;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenSumEvenNumbersFromTwoToSevenThenTwelve() {
        int start = 2;
        int finish = 7;
        int result = Counter.sumByEven(start, finish);
        int expected = 12;
        Assert.assertEquals(result, expected);
    }
}