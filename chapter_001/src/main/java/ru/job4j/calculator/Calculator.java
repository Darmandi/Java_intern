package ru.job4j.calculator;

/**Калькулятор
 * @author  Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Calculator {
	private double result;

    /**
     * Сложение
     * @param first
     * @param second
     */
	public void add(double first, double second) {
		this.result = first + second;
	}

    /**
     * Вычитание
     * @param first
     * @param second
     */
	public void substract(double first, double second) {
		this.result = first - second;
	}

    /**
     * Деление
     * @param first
     * @param second
     */
	public void div(double first, double second) {
		this.result = first / second;
	}

    /**
     * Умножение
     * @param first
     * @param second
     */
	public void multiple(double first, double second) {
		this.result = first * second;
	}

    /**
     * Вывод результата
     */
	public double getResult() {
		return this.result;
	}
}