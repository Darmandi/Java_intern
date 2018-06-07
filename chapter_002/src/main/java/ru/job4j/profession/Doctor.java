package ru.job4j.profession;

/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 03.06.2018
 */
public class Doctor extends Profession {

    public Doctor() {
    }

    public Doctor(String name, String profession) {
        super(name, profession);
    }
     /**
     * Лечит кашель у пациента
     * @param patient пациент с жалобой
     * @return лечит кашель или не распознает заболевание
     */
    public Diagnose heal(Patient patient) {
        Diagnose rsl = new Diagnose("Неизвестная болезнь");
        if (patient.complaint.equals("Кашель")) {
            rsl = new Diagnose("Лечить кашель");
        }
    return rsl;
    }
}
