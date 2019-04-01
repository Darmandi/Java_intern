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
     * Перевести сумму со счета на другой счет
     * @param destAcc счет, которому переводят
     * @param amount сумма
     * @return успешность перевода
     */
    public boolean transfer(Account destAcc, double amount) {
        boolean res = false;
        if (this.value >= amount) {
            this.value -= amount;
            destAcc.value += amount;
            res = true;
        }
        return res;
    }

    public int getRequisites() {
        return this.requisites;
    }
}