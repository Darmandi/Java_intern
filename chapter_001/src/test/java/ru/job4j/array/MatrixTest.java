package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void whenMatrixThree(){
        Matrix matrix = new Matrix();
        assertThat(matrix.multiple(3), is(new int[][]{{1, 2, 3}, {2, 4, 6}, {3, 6, 9}}));
    }
    @Test
    public void whenMatrixFive(){
        Matrix matrix = new Matrix();
        assertThat(matrix.multiple(5), is(new int[][]{{1, 2, 3, 4, 5}, {2, 4, 6, 8, 10}, {3, 6, 9, 12, 15}, {4, 8, 12, 16, 20}, {5, 10, 15, 20, 25}}));
    }
}
