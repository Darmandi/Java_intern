package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void sortArrayWithSixElements() {
        BubbleSort massiv = new BubbleSort();
        assertThat(massiv.sort(new int[]{6, 5, 4, 3, 2, 1}), is(new int[]{1, 2, 3, 4, 5, 6}));
    }
    @Test
    public void sortArrayWithTenElements() {
        BubbleSort massiv = new BubbleSort();
        assertThat(massiv.sort(new int[]{9, 10, 5, 2, 6, 8, 4, 3, 7, 1}), is(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
