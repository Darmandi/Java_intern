package ru.job4j.search;

/**
 * Класс контакт для справочника
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    /**
     * Контакт
     * @param name имя
     * @param surname фамилия
     * @param phone телефон
     * @param address адресс
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
