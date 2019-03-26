package ru.job4j.tracker;

/**
 * Класс исключения
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class MenuOutException extends RuntimeException {

    public MenuOutException(String msg) {
        super(msg);
    }
}
