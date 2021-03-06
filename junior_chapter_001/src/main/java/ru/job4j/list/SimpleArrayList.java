package ru.job4j.list;

/**
 * Класс для односвязного списка
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class SimpleArrayList<E> {

    private int size;
    private Node<E> first;

    /**
     * Метод вставляет в начало списка данные
     * @param date данные
     */
    public void add(E date) {
        Node<E> newLink = new Node<>(date);
        newLink.next = this.first;
        this.first = newLink;
        this.size++;
    }

    /**
     * Реализовать метод удаления первого элемент в списке.
     */
    public E delete() {
        Node<E> deleted = null;
        if (size > 0) {
            deleted = first;
            first = first.next;
            deleted.next = null;
            size--;
        }
        return deleted.date;
    }

    /**
     * Метод получения элемента по индексу
     * @param index индекс
     * @return элемент
     */
    public E get(int index) {
        Node<E> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.date;
    }

    /**
     * Метод получения размера коллекции.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Класс предназначен для хранения данных.
     */
    private static class Node<E> {

        E date;
        Node<E> next;

        Node(E date) {
            this.date = date;
        }
    }
}
