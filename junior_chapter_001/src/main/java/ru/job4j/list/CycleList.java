package ru.job4j.list;

/**
 * Класс для односвязного списка с петлей
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class CycleList {

    /**
     * Метод вставляет в начало списка данные
     * @param date данные
     */
    /**
     * Метод проверяет наличие замыкания в списке
     * @param first элемент начала проверки
     * @return true или false
     */
    public boolean hasCycle(Node first) {
        boolean result = false;
        String list = "";
        Node elem = first;
        while (elem.next != null) {
            list += elem.toString();
            elem = elem.next;
            if (list.contains(elem.toString())) {
                result = true;
                break;
            }
        }
        return result;
    }
}

/**
 * Класс предназначен для хранения данных.
 */
class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }
}
