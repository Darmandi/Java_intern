package ru.job4j.profession;

/**
 * Класс диагноза для класаа Doctor
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Diagnose {
    String diagnose;

    /**
     * Диагноз
     * @param diagnose выставляемый диагноз
     */
    public Diagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getDiagnose() {
        return this.diagnose;
    }

}
