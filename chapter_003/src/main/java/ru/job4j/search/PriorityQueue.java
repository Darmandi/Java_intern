package ru.job4j.search;

import java.util.LinkedList;

/**
 * Класс список задач
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class PriorityQueue {
    private LinkedList<Task> list = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю priority.
     * Если не выполняется условие в цикле, task помещается в конце
     * @param task элемент
     */
    public void put(Task task) {
        var index = list.size();
        for (var i = 0; i < list.size(); i++) {
            if (list.get(i).getPriority() > task.getPriority()) {
                index = i;
                break;
            }
        }
        list.add(index, task);
    }

    /**
     * Вернуть элемент списка по индексу
     * @param index индекс
     * @return элемент списка
     */
    public Task take(int index) {
        return this.list.get(index);
    }
}
