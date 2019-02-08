package ru.job4j.search;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PhoneDictionaryTest {
    PhoneDictionary phones = new PhoneDictionary();
    @Before
    public void addPerson() {
        phones.add(new Person("Ivan", "Ivanov", "123456", "Moscow"));
        phones.add(new Person("Dmitriy", "Dmitriev", "234567", "Saratov"));
        phones.add(new Person("Vladimir", "Vladimirov", "345678", "St.Petersburg"));
    }
    @Test
    public void whenFindByName() {
        List<Person> persons = phones.find("Ivan");
        assertThat(persons.iterator().next().getSurname(), is("Ivanov"));
    }
    @Test
    public void whenFindBySurname() {
        List<Person> persons = phones.find("Dmitriev");
        assertThat(persons.iterator().next().getAddress(), is("Saratov"));
    }
    @Test
    public void whenFindByPhone() {
        List<Person> persons = phones.find("34");
        assertThat(persons.get(0).getName(), is("Ivan"));
        assertThat(persons.get(1).getName(), is("Dmitriy"));
        assertThat(persons.get(2).getName(), is("Vladimir"));
    }
    @Test
    public void whenFindByCity() {
        List<Person> persons = phones.find("Moscow");
        assertThat(persons.iterator().next().getName(), is("Ivan"));
    }
}