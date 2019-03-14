package ru.job4j.profession;

/**
 * Класс учитель
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Teacher extends Profession {
    public Teacher() {
    }

    public Teacher(String name, String profession) {
        super(name, profession);
    }

    /**
     * Учит студента
     * @param student студент
     * @return учит или не учит студента
     */
    public  String teach(Student student) {
        String rsl = "Учим студента";
        if (student.study.equals("Не учусь")) {
            rsl = "Не учим студента";
        }
        return rsl;
    }
}
