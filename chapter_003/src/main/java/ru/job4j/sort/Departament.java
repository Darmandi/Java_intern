package ru.job4j.sort;

import java.util.StringJoiner;

/**
 * Класс департамент для соритровки департаментов
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Departament implements Comparable<Departament> {
    private String code;
    private String surveys;
    private String departament;
    private String name;

    /**
     * Департамент
     * @param code код департамента
     */
    public Departament(String code) {
        this.code = code;
        StringBuilder str = new StringBuilder();
        name = new StringJoiner("\\")
                .add(code)
                .toString();
    }

    /**
     * Департамент
     * @param code код департамента
     * @param surveys  служба департамента
     */
    public Departament(String code, String surveys) {
        this.code = code;
        this.surveys = surveys;
        StringBuilder str = new StringBuilder();
        name = new StringJoiner("\\")
                .add(code)
                .add(surveys)
                .toString();
    }
    /**
     * Департамент
     * @param code код департамента
     * @param surveys служба департамента
     * @param departament отдел департамента
     */
    public Departament(String code, String surveys, String departament) {
        this.code = code;
        this.surveys = surveys;
        this.departament = departament;
        StringBuilder str = new StringBuilder();
        name = new StringJoiner("\\")
                .add(code)
                .add(surveys)
                .add(departament)
                .toString();
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getSurveys() {
        return this.surveys;
    }

    public String getDepartament() {
        return this.departament;
    }

    /**
     * Метод сравнивает департаменты по имени
     * @param dep департамент
     * @return результат сравнивания
     */
    @Override
    public int compareTo(Departament dep) {
        int result = name.compareTo(dep.name);
        return result;
    }
}
