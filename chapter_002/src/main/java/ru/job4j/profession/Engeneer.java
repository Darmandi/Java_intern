package ru.job4j.profession;

/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 03.06.2018
 */
public class Engeneer extends Profession {

    public Engeneer() {
    }

    public Engeneer(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }
    /**
     * Строит дом
     * @param house размер дома
     * @return размер строящегося дома
     */
    public  String build(House house) {
        String rsl = "Строим обычный дом";
        if (house.size.equals("Большой")) {
            rsl = "Строим большой дом";
        }
        return rsl;
    }
}
