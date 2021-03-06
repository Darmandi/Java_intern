package ru.job4j.list;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(List.of(1, 2, 3, 4, 5, 6, 7), 3);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }
    @Test
    public void when12ElementsThen15() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12), 5);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {0, 0, 0}
        };
        assertThat(result, is(expect));
    }
    @Test
    public void when3Arrays() {
        ConvertList2Array list = new ConvertList2Array();
        List<int[]> arraylist = List.of(new int[] {1, 2, 3, 4, 5}, new int[] {6, 7, 8});
        List<Integer> result = list.convert(arraylist);
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertThat(result, is(expect));
    }
}
