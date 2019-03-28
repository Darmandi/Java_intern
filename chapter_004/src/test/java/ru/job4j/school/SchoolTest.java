package ru.job4j.school;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class SchoolTest {
    List<Student> students = new ArrayList<>();
    School school = new School();

    @Before
    public void fillList() {
        students.add(new Student(10));
        students.add(new Student(20));
        students.add(new Student(30));
        students.add(new Student(40));
        students.add(new Student(50));
        students.add(new Student(60));
        students.add(new Student(70));
        students.add(new Student(80));
        students.add(new Student(90));
        students.add(new Student(100));
    }

    @Test
    public void classA() {
        List<Student> aClass = school.collect(students, i -> i.getScore() >= 70);
        Assert.assertThat(aClass.size(), is(4));
        Assert.assertThat(aClass.get(0).getScore(), is(70));
        Assert.assertThat(aClass.get(1).getScore(), is(80));
        Assert.assertThat(aClass.get(2).getScore(), is(90));
        Assert.assertThat(aClass.get(3).getScore(), is(100));
    }

    @Test
    public void classB() {
        List<Student> aClass = school.collect(students, i -> i.getScore() >= 50 && i.getScore() < 70);
        Assert.assertThat(aClass.size(), is(2));
        Assert.assertThat(aClass.get(0).getScore(), is(50));
        Assert.assertThat(aClass.get(1).getScore(), is(60));
    }

    @Test
    public void classC() {
        List<Student> aClass = school.collect(students, i -> i.getScore() >= 0 && i.getScore() < 50);
        Assert.assertThat(aClass.size(), is(4));
        Assert.assertThat(aClass.get(0).getScore(), is(10));
        Assert.assertThat(aClass.get(1).getScore(), is(20));
        Assert.assertThat(aClass.get(2).getScore(), is(30));
        Assert.assertThat(aClass.get(3).getScore(), is(40));
    }
}
