package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void sumOfEvenTest() {
        Counter tenToTwenty = new Counter();
        assertThat(tenToTwenty.sumOfEven(10, 20), is(90));

    }
}
