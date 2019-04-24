package ru.job4j.set;

import ru.job4j.list.DynamicList;
import java.util.Iterator;

/**
 * Класс для Set, реализованного на базе динамического списка(который на базе массива)
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class SimpleSet<E> implements Iterable<E> {
    private DynamicList<E> container;

    public SimpleSet() {
        container = new DynamicList<>();
    }

    public SimpleSet(int size) {
        container = new DynamicList<>(size);
    }

    /**
     * Итератор класса
     * @return итератор
     */
    @Override
    public Iterator<E> iterator() {
        return container.iterator();
    }

    /**
     * Добавляет новый элемент, если он не дублирует существующий
     * @param elem элемент
     */
    public void add(E elem) {
        boolean rep = false;
        for (int i = 0; i < container.getSize(); i++) {
            if (!elem.equals(container.get(i))) {
                rep = true;
                break;
            }
        }
        if (!rep) {
            container.add(elem);
        }
    }

    public int size() {
        return container.getSize();
    }
}
