package ru.job4j.bank;

/**
 * Класс лицевого счета пользователя
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Account {
    private double value;
    private int requisites;

    /**
     * Счет
     * @param value сумма на счете
     * @param requisites реквизиты счета
     */
    public Account(double value, int requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return this.value;
    }

    /**
     * Добавить сумму на счет
     * @param value сумма
     */
    public void addToValue(double value) {
        this.value = this.value + value;
    }

    /**
     * Снять сумму со счета
     * @param value сумма
     */
    public void subFromValue(double value) {
        this.value = this.value - value;
    }

    public int getRequisites() {
        return this.requisites;
    }
}