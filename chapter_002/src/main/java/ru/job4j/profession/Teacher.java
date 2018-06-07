package ru.job4j.profession;
/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 05.06.2018
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
