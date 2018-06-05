package ru.job4j.profession;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TeacherTest {
    @Test
    public void whenNotStudy() {
        Student student = new Student("Джеф", "Не учусь");
        Teacher teacher = new Teacher();
        String result = teacher.teach(student);
        assertThat(result, is("Не учим студента"));
    }
}
