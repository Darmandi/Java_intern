package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn massiv = new Turn();
        assertThat(massiv.back(new int[]{1, 2, 3, 4}), is(new int[]{4, 3, 2, 1}));
    }
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn massiv = new Turn();
        assertThat(massiv.back(new int[]{1, 2, 3, 4, 5}), is(new int[]{5, 4, 3, 2, 1}));
    }
}
