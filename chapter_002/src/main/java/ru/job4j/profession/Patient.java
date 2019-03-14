package ru.job4j.profession;

/**
 * Класс пациента для класса Doctor
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Patient {
    public String name;
    public String complaint;

    /**
     * Пациент
     * @param name имя пациента
     * @param complaint жалоба пациента
     */
    public Patient(String name, String complaint) {
        this.name = name;
        this.complaint = complaint;
    }

}
