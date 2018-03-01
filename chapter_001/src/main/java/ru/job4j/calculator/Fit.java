package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
	
	private double weight;
    private final int Hundred = 100;
    private final int HundredTen = 110;
    private final double OnePointFifteen = 1.15;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
		this.weight = (height-Hundred)*OnePointFifteen;
        return this.weight;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
		this.weight = (height-HundredTen)*OnePointFifteen;
        return this.weight;
    }
}