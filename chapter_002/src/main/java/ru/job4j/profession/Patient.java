package ru.job4j.profession;

/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 03.06.2018
 */

public class Patient {
    public String name;
    public String complaint;

    /**
     * Класс пациента для класса Doctor
     * @param name имя пациента
     * @param complaint жалоба пациента
     */

    public Patient(String name, String complaint) {
        this.name = name;
        this.complaint = complaint;
    }

}
