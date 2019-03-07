package ru.job4j.tracker.trackersingleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import java.util.List;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public enum TrackerSingleEnum {
    INSTANCE;

    //Используем композицию
    Tracker tracker = new Tracker();

    public Item add(Item item) {
        return this.tracker.add(item);
    }

    public boolean replace(String id, Item item) {
        return this.tracker.replace(id, item);
    }

    public boolean delete(String id) {
        return this.tracker.delete(id);
    }

    public Item findByID(String id) {
        return this.tracker.findByID(id);
    }

    public List<Item> getAll() {
        return this.tracker.getAll();
    }

    public List<Item> findByName(String name) {
        return this.tracker.findByName(name);
    }
}
