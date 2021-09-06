package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortFrom3() {
        int[] data = new int[] {2, 4, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortFrom5() {
        int[] data = new int[] {7, 4, 1, 9, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 3, 4, 7, 9};
        Assert.assertArrayEquals(expected, result);
    }
}