package ru.job4j.tomap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import static org.hamcrest.core.Is.is;

public class ConvertToMapTest {
    ConvertToMap map = new ConvertToMap();
    List<Student> list = new ArrayList<>();
    Student st1 = new Student("Artem");
    Student st2 = new Student("Dmitrii");
    Student st3 = new Student("Fedor");
    Student st4 = new Student("Igor");
    Student st5 = new Student("Nik");

    @Before
    public void fillList() {
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
    }

    @Test
    public void whenArtemThenSt1() {
        Map<String, Student> converted = map.convert(list);
        Assert.assertThat(converted.get("Artem"), is(st1));
    }

    @Test
    public void whenArtemThenSt2() {
        Map<String, Student> converted = map.convert(list);
        Assert.assertThat(converted.get("Dmitrii"), is(st2));
    }

    @Test
    public void whenArtemThenSt3() {
        Map<String, Student> converted = map.convert(list);
        Assert.assertThat(converted.get("Fedor"), is(st3));
    }

    @Test
    public void whenArtemThenSt4() {
        Map<String, Student> converted = map.convert(list);
        Assert.assertThat(converted.get("Igor"), is(st4));
    }
}
