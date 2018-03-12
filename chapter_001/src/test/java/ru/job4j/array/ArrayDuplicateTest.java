package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenDuplicateStringFive() {
        ArrayDuplicate string_massiv = new ArrayDuplicate();
        assertThat(string_massiv.remove(new String[]{"Hello", "World", "Hello", "Super", "World"}), is(new String[]{"Hello", "World", "Super"}));
    }
    @Test
    public void whenDuplicateStringEight() {
        ArrayDuplicate string_massiv = new ArrayDuplicate();
        assertThat(string_massiv.remove(new String[]{"Hello", "World", "Hello", "Super", "World", "Super", "Night", "Reason"}), is(new String[]{"Hello", "World", "Super", "Night", "Reason"}));
    }
}