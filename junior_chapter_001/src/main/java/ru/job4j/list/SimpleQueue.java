package ru.job4j.list;

/**
 * Класс для очереди на базе двух стеков
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class SimpleQueue<T> {
    SimpleStack<T> stack = new SimpleStack<>();
    SimpleStack<T> queue = new SimpleStack<>();

    /**
     * Метод вставляет в начало первого списка данные
     * @param value данные
     */
    public void push(T value) {
        stack.push(value);
    }

    /**
     * Метод копирует данные из первого списка во второй в обратном порядке
     * затем удаляет данные из начала второго списка
     * @return удаленные данные
     */
    public T poll() {
        int size = stack.size();
        if (queue.size() == 0 && size > 0) {
            for (int i = 0; i < size; i++) {
                queue.push(stack.poll());
            }
        }
        return queue.poll();
    }

}
