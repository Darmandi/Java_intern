package ru.job4j.flatmap;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;


import static org.hamcrest.core.Is.is;

public class ConvertTest {
    Convert obj = new Convert();

    @Test
    public void nineElementMatrix() {
        Integer[][] matrix = new Integer[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assert.assertThat(obj.toList(matrix), is(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
    }

    @Test
    public void sevenElementMatrix() {
        Integer[][] matrix = new Integer[][] {{1, 2, 3}, {4, 5}, {6, 7}};
        Assert.assertThat(obj.toList(matrix), is(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
    }
}
