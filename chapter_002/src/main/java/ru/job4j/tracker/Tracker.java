package ru.job4j.tracker;
import java.util.*;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class Tracker {
    private List<Item> items = new ArrayList<>();
    //private int position = 0;
    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setID(this.generateId());
        this.items.add(item);
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
    public boolean replace(String id, Item item) {
            int index = getPosition(id);
            boolean result = false;
            if (index != -1) {
                item.setID(id);
                this.items.set(index, item);
                result = true;
            }
            return result;
    }

    /**
     * Метод удаляет заявку по ключу и сдвигает позиции в массиве
     * @param id ключ заявки
     */
    public boolean delete(String id) {
        int temp = getPosition(id);
        boolean result = false;
        if (temp != -1) {
            items.remove(temp);
            result = true;
        }
        return result;
    }
    /**
     * Метод ищет заявку по id уникальному ключу
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
        for (int index = 0; index < this.items.size(); index++) {
            if (items.get(index).getID().equals(id)) {
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
    public List<Item> getAll() {
        //Возвращаем массив без null элементов
        return this.items;
    }

    /**
     * Метод ищет заявки по имени и формирует массив из совпадений
     * @param name имя заявки
     * @return массив совпадений
     */
    public List<Item> findByName(String name) {
        List<Item> itemsnew = new ArrayList<>();
        for (Item item: items) {
            if (item.getName().equals(name)) {
                itemsnew.add(item);
            }
        }
        return itemsnew;
    }
}