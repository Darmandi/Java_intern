package ru.job4j.list;

/**
 * Класс для стэка на базе связного списка
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class SimpleStack<T> {
    DynamicLincedList<T> container = new DynamicLincedList<>();

    /**
     * Метод удаляет данные из начала списка
     * @return удаленные данные
     */
    public T poll() {
        return container.delete();
    }

    /**
     * Метод вставляет в начало списка данные
     * @param value данные
     */
    public void push(T value) {
        container.add(value);
    }

    public int size() {
        return container.getSize();
    }
}
