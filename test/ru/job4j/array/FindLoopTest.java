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

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind1() {
        int[] data = new int[] {2, 4, 6, 9, 3, 1};
        int el = 4;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind6() {
        int[] data = new int[] {8, 14, 6, 11, 3, 5};
        int el = 5;
        int start = 1;
        int finish = 5;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 6;
        Assert.assertEquals(expected, result);
    }
}