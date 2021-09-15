package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To8Then8() {
        int left = 5;
        int right = 8;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To7Then7() {
        int left = 7;
        int right = 7;
        int result = Max.max(left, right);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2And5Then5() {
        int left = 3;
        int right = 2;
        int first = 5;
        int result = Max.max(left, right, first);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To30And9Then30() {
        int left = 7;
        int right = 30;
        int first = 9;
        int result = Max.max(left, right, first);
        int expected = 30;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax11And4To8And9Then11() {
        int left = 11;
        int right = 4;
        int first = 8;
        int second = 9;
        int result = Max.max(left, right, first, second);
        int expected = 11;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7And7To3And6Then7() {
        int left = 7;
        int right = 7;
        int first = 3;
        int second = 6;
        int result = Max.max(left, right, first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}