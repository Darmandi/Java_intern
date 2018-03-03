package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void factorialFiveTest() {
        Factorial five = new Factorial();
        assertThat(five.factorial(5), is(120));
    }
    @Test
    public void factorialZeroTest () {
        Factorial zero = new Factorial();
        assertThat(zero.factorial(0), is(1));
    }
}
