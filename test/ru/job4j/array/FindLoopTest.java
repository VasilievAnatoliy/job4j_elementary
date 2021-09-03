package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas6Then3() {
        int[] data = {4, 5, 2, 6, 8};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas7Then() {
        int[] data = {2, 4, 8, 0, 1};
        int el = 7;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}