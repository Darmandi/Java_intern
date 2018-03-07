package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void massiv3(){
        Square massiv = new Square();
        assertThat(massiv.calculate(3), is(new int[]{1,4,9}));
    }
    @Test
    public void massiv5() {
        Square massiv = new Square();
        assertThat(massiv.calculate(5), is(new int[] {1, 4, 9, 16, 25}));
    }
}
