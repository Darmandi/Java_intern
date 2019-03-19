package ru.job4j.sort;

/**
 * Реализация Comparable
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class User implements Comparable<User> {
    private String name;
    private int age;

    /**
     * Пользователь
     * @param name имя
     * @param age возраст
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    /**
     * Метод сортирует User по возрасту, если равны, то по имени
     * @param user User
     * @return результат сравнивания
     */
    @Override
    public int compareTo(User user) {
        int result = Integer.compare(this.age, user.age);
        return result;
    }
}
