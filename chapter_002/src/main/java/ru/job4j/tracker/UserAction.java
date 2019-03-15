package ru.job4j.tracker;

/**
 * Интерфейс для действия пользователя
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public interface UserAction {

    /**
     * Метод возвращает ключ опции меню.
     * @return ключ
     */
    int key();

    /**
     * Обрабатывает ввод пользователя и вносит изменения в трекер.
     * @param input ввод
     * @param tracker трекер
     */
    void execute(Input input, Tracker tracker);

    /**
     * Метод возвращает информацию о данном пункте меню.
     * @return Строка меню
     */
    String info();
}
