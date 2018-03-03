package ru.job4j.max;
/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 2.03.2018
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

    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}
