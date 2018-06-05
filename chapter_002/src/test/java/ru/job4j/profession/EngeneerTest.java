package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EngeneerTest {
    @Test
    public void whenBig() {
        House house = new House("Большой");
        Engeneer engeneer = new Engeneer();
        String result = engeneer.build(house);
        assertThat(result, is("Строим большой дом"));
    }
}