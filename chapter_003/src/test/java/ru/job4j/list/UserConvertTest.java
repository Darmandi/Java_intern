package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {
    UserConvert hashmap = new UserConvert();
    List<User> list;
    @Before
    public void fillList() {
        list = List.of(
        new User(1, "Andrey", "Moscow"),
        new User(2, "Boris", "Tula"),
        new User(3, "Oleg", "Vladimir"));
    }
    @Test
    public void whenFind3rd() {
        HashMap<Integer, User> result = hashmap.process(list);
        assertThat(result.get(3).getName(), is("Oleg"));
    }
}
