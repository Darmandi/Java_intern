package ru.job4j.tracker.trackersingleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class TrackerSingleStaticField {
    private static TrackerSingleStaticField instance;

    private TrackerSingleStaticField() { }

    public static TrackerSingleStaticField getInstance() {
        if (instance == null) {
            instance = new TrackerSingleStaticField();
        }
        return instance;
    }

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

    public Item[] getAll() {
        return this.tracker.getAll();
    }

    public Item[] findByName(String name) {
        return this.tracker.findByName(name);
    }
}
