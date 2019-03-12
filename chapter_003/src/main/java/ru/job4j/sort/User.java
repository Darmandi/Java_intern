package ru.job4j.sort;

/**
 * @author Dmitrii Saraev
 * @version 0.1
 */

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
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
