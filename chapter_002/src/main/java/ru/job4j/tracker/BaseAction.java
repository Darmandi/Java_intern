package ru.job4j.tracker;

/**
 * Базовый класс для действия пользователя
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public abstract class BaseAction implements UserAction {
    private final int key;
    private final String name;

    /**
     * Действие по ключу и названию опции меню
     * @param key ключ опции
     * @param name название опции
     */
    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }
    @Override
    public int key() {
        return this.key;
    }
    @Override
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }
}