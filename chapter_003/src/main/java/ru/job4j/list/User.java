package ru.job4j.list;

/**
 * Класс User для UserConvert
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class User {
    private int id;
    private String name;
    private String city;

    /**
     * User
     * @param id ключ
     * @param name имя
     * @param city город
     */
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getCity() {
        return this.city;
    }
}
