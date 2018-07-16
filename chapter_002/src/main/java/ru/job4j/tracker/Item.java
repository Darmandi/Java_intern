package ru.job4j.tracker;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class Item {
    public String id;
    public String name;
    public String desc;
    public long created;
    public String[] comments;

    public Item(String id, String name, String desc, long created, String[] comments) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.created = created;
        this.comments = comments;
    }

    public Item(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public void setID(String id) {
        this.id = id;
    }

    public String getID() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCreated(long created) {
        this.created = created;
    }
    public void setComments(String[] comments) {
        this.comments = comments;
    }
    public String toString() {
        return "ID: " + getID() + " Имя заявки: " + getName();
    }
}
