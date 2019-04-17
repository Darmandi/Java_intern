package ru.job4j.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Класс для динамического списка на базе связного списка
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class DynamicLincedList<E> implements Iterable<E> {
    private int modCount;
    private Node<E> first;
    private int size;

    /**
     * Метод получения размера коллекции.
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Метод вставляет в начало списка данные
     * @param value данные
     */
    public void add(E value) {
        Node<E> newLink = new Node(value);
        newLink.next = first;
        first = newLink;
        size++;
        modCount++;
    }

    /**
     * Метод получения элемента по индексу
     * @param index индекс
     * @return элемент
     */
    public E get(int index) {
        Node<E> result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.date;
    }

    /**
     * Метод удаляет данные из начала списка
     * @return удаленные данные
     */
    public E delete() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        E elem = first.date;
        first = first.next;
        size--;
        modCount++;
        return elem;
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

    /**
     * Итератор класса
     * @return итератор
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<>() {
            private Node<E> elem = first;
            int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                return elem.next != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                if (modCount != expectedModCount) {
                    throw new ConcurrentModificationException();
                }
                E result = elem.next.date;
                elem = elem.next;
                return result;
            }
        };
    }
}
