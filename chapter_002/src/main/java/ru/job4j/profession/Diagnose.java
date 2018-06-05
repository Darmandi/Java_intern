package ru.job4j.profession;

/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 03.06.2018
 */

public class Diagnose {
    String diagnose;

    /**
     * Класс диагноза для класаа Doctor
     * @param diagnose выставляемый диагноз
     */
    public Diagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getDiagnose() {
        return this.diagnose;
    }

}
