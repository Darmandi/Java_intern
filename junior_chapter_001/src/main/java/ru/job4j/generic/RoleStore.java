package ru.job4j.generic;

/**
 * Хранилище объектов Role
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class RoleStore extends AbstractStore<Role> {

    public RoleStore(int size) {
        super(new SimpleArray<>(size));
    }
}
