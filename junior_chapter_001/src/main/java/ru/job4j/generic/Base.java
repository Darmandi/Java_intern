package ru.job4j.generic;

/**
 * Базовый класс для объектов
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public abstract class Base {
    private final String id;

    protected Base(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
