package ru.job4j.jdk11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class StudentTest {
    List<Student> list = new ArrayList();

    @Before
    public void fillList() {
        list.add(new Student("Andrei", 10));
        list.add(new Student("Fedor", 20));
        list.add(new Student("Vitalii", 80));
        list.add(new Student("Dmitrii", 40));
        list.add(null);
        list.add(new Student("Dmitrii", 80));
        list.add(null);
        list.add(new Student("Vladislav", 30));
    }

    @Test
    public void classA() {
        List<Student> aClass = Student.levelOf(list, 70);
        Assert.assertThat(aClass.size(), is(2));
        Assert.assertThat(aClass.get(0).getName(), is("Dmitrii"));
        Assert.assertThat(aClass.get(1).getName(), is("Vitalii"));
    }
}
