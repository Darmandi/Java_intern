package ru.job4j.max;

/**
 * Тернарный оператор
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class Max {

    /**
     * Возвращаем максимальное число из двух
     * @param first первое чило
     * @param second второе число
     * @return максимальное число
     */
    public int max(int first, int second) {
        return first >= second ? first : second;
    }

    /**
     * Возвращаем максимальное число из трех
     * @param first первое чило
     * @param second второе число
     * @param third третье число
     * @return максимальное число
     */
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}
