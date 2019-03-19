package ru.job4j.search;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

/**
 * Класс справочник
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    /**
     * Добавить контакт в справочник
     * @param person контакт
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех контактов, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person contact : persons) {
            if (contact.getName().contains(key) || contact.getSurname().contains(key) || contact.getPhone().contains(key) || contact.getAddress().contains(key)) {
                result.add(contact);
            }
        }
        return result;
    }
}
