package ru.job4j.profession;

/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 19.04.2018
 */

public class Profession {
    public String name;
    public String profession;

    public Profession() {
    }

    /**
     * Класс профессии
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
