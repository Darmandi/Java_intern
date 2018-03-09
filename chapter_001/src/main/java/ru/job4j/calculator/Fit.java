package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
	
	private double weight;
    static final int MAN_HEIGHT_MODIFICATOR = 100;
    static final int WOMAN_HEIGHT_MODIFICATOR = 110;
    static final double WEIGHT_MODIFICATOR = 1.15;

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
		this.weight = (height - MAN_HEIGHT_MODIFICATOR) * WEIGHT_MODIFICATOR;
        return this.weight;
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
		this.weight = (height - WOMAN_HEIGHT_MODIFICATOR) * WEIGHT_MODIFICATOR;
        return this.weight;
    }
}