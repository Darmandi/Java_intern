package ru.job4j.tracker;
import java.util.*;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class Tracker {
    private Item[] items = new Item[100];
    private int position = 0;
    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setID(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }

    /**
     * Метод удаляет заявку по ключу и заменяет её на новую
     * @param id ключ удаляемой заявки
     * @param item новая заявка
     */
    public void replace(String id, Item item) {
        if (findByID(id) != null) {
            this.items[getPosition(id)] = item;
        }
    }

    /**
     * Метод удаляет заявку по ключу и сдвигает позиции в массиве
     * @param id ключ заявки
     */
    public void delete(String id) {
        if (findByID(id) != null) {
                System.arraycopy(items, getPosition(id) + 1, items, getPosition(id), items.length - getPosition(id) - 1);
                this.position--;
        }
    }
    /**
     * Метод ищет заявку по id уeникальному ключу
     * @param id уникальный ключ
     * @return найденая заявка
     */
    public Item findByID(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getID().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод возвращает индекс заявки в массиве
     * @param id ключ заявки
     * @return индекс
     */
    public int getPosition(String id) {
        int result = -1;
        for (int index = 0; index < this.position + 1; index++) {
            if (items[index].getID() == id) {
                result = index;
                break;
            }
        }
        return result;
    }

    /**
     * Метод отображает все заявки
     * @return список заявок
     */
    public Item[] getAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index < position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }

    /**
     * Метод ищет заявки по имени и формирует массив из совпадений
     * @param name имя заявки
     * @return массив совпадений
     */
    public Item[] findByName(String name) {
        int cons = 0;
        Item[] itemsnew = new Item[100];
        for (int index = 0; index < position; index++) {
            if (items[index].getName().equals(name)) {
                itemsnew[cons++] = items[index];
            }
        }
        //Создаем новый массив без null элементов
        Item[] result = new Item[cons];
        for (int index = 0; index < cons; index++) {
            result[index] = itemsnew[index];
        }
        return result;
    }
}