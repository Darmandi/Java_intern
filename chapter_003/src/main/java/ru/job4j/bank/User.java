package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс пользлватель
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class User {
    private String name;
    private int passport;

    /**
     * Пользователь
     * @param name имя
     * @param passport пасспорт
     */
    public User(String name, int passport) {
        this.name = name;
        this.passport = passport;
    }

    public int getPassport() {
        return this.passport;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return user.name.equals(name) && user.passport == passport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, passport);
    }
}
