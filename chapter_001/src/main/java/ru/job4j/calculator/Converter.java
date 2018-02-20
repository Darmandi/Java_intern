package ru.job4j.calculator;
/**
 * Конвертер валюты.
 */
public class Converter {
	
	private int result;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
		this.result = value*70;
		return -1;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        this.result = value*60;
        return -1;
    }
	
	/**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли.
     */
    public int euroToRuble(int value) {
		this.result = value/70;
        return -1;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return рубли
     */
    public int dollarToRuble(int value) {
        this.result = value/60;
        return -1;
    }
}