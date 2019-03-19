package ru.job4j.search;

/**
 * Класс задача для списка задач
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Task {
    private String desc;
    private int priority;

    /**
     * Задача
     * @param desc описание
     * @param priority приоритет
     */
    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
