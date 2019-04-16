package ru.job4j.generic;

/**
 * Хранилище объектов User
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class UserStore extends AbstractStore<User> {

    public UserStore(int size) {
        super(new SimpleArray<>(size));
    }
}
