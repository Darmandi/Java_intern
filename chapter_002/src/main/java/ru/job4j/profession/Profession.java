package ru.job4j.profession;

/**
 * Класс профессия
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Profession {
    public String name;
    public String profession;

    public Profession() {
    }

    /**
     * Профессия
     * @param name имя
     * @param profession название профессии
     */
    public Profession(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    public String getName() {
        return this.name;
    }

    public String getProfession() {
        return this.profession;
    }
}
