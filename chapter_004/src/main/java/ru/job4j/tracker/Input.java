package ru.job4j.tracker;

/**
 * Интерфейс для ввода пользователя
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public interface Input {

    /**
     * Выводит запрос
     * @param question текст запроса
     */
    String ask(String question);

    /**
     * Выводит запрос и проверяет ключ ввода
     * @param question текст запроса
     * @param range ключ
     */
    int ask(String question, int[] range);
}
