package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharInArrayCharTest {
    @Test
    public void whenResultMustBeTrue() {
        ArrayCharInArrayChar word = new ArrayCharInArrayChar();
        assertThat(word.contains("Hellomy", "omy"), is(true));
    }
    @Test
    public void whenResultMustBeFalse() {
        ArrayCharInArrayChar word = new ArrayCharInArrayChar();
        assertThat(word.contains("Hello", "ellol"), is(false));
    }
}
