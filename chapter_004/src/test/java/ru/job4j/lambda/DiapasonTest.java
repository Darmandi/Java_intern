package ru.job4j.lambda;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class DiapasonTest {
    Diapason function = new Diapason();

    @Test
    public void lineFunction() {
        List<Double> result = function.diapason(1, 10, x -> x + 10);
        List<Double> expected = Arrays.asList(11D, 12D, 13D, 14D, 15D, 16D, 17D, 18D, 19D);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void quadFunction() {
        List<Double> result = function.diapason(1, 10, x -> Math.pow(x, 2));
        List<Double> expected = Arrays.asList(1D, 4D, 9D, 16D, 25D, 36D, 49D, 64D, 81D);
        Assert.assertThat(result, is(expected));
    }

    @Test
    public void logFunction() {
        List<Double> result = function.diapason(1, 10, x -> Math.log(x));
        List<Double> expected = Arrays.asList(Math.log(1), Math.log(2), Math.log(3), Math.log(4), Math.log(5), Math.log(6), Math.log(7), Math.log(8), Math.log(9));
        Assert.assertThat(result, is(expected));
    }
}
