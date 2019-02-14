package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> list = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю priority.
     * Если не выполняется условие в цикле, task помещается в конце
     * @param task элемент
     */
    public void put(Task task) {
        int index = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPriority() > task.getPriority()) {
                index = i;
                break;
            }
        }
        list.add(index, task);
    }

    public Task take(int index) {
        return this.list.get(index);
    }
}
