package ru.job4j.calculator;
/**
 * Конвертер валюты.
 */
public class Converter {
	
	private int result;
	private final int Rubineu = 70;
    private final int Rubinusd = 60;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
		this.result = value/Rubineu;
		return this.result;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        this.result = value/Rubinusd;
        return this.result;
    }
	
	/**
     * Конвертируем евро в рубли.
     * @param value евро.
     * @return рубли.
     */
    public int euroToRuble(int value) {
		this.result = value*Rubineu;
        return this.result;
    }

    /**
     * Конвертируем доллары в рубли.
     * @param value доллары.
     * @return рубли
     */
    public int dollarToRuble(int value) {
        this.result = value*Rubinusd;
        return this.result;
    }
}