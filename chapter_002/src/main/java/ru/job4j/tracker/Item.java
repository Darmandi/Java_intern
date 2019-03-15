package ru.job4j.tracker;

/**
 * Класс заявки
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Item {
    public String id;
    public String name;
    public String desc;
    public long created;
    public String[] comments;

    /**
     * Заявка
     * @param id id заявки
     * @param name имя заявки
     * @param desc описание
     * @param created дата создания
     * @param comments комментарий
     */
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
