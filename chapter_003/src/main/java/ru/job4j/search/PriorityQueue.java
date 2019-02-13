package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> list = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю priority.
     * @param task элемент
     */
    public void put(Task task) {
        int size = list.size();
        if (size == 0) {
            list.add(task);
        } else {
            for (int i = 0; i < size; i++) {
                if (list.get(i).getPriority() <= task.getPriority() && list.get(i + 1).getPriority() > task.getPriority()) {
                    list.add(i + 1, task);
                    break;
                }
            }
        }
    }

    public Task take(int index) {
        return this.list.get(index);
    }
}
