package ru.job4j.profession;

/**
 * Класс инженер
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Engeneer extends Profession {

    public Engeneer() {
    }

    public Engeneer(String name, String profession) {
        super(name, profession);
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
