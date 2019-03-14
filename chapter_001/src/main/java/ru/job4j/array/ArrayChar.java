package ru.job4j.array;

/** Совпадение начала стова с искомым префиксом
 * @author  Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class ArrayChar {
    private char[] data;

    /**
     * @param line проверяемая строка
     */
    public ArrayChar(String line) {
        this.data  = line.toCharArray();
    }

    /**
     * Проверяет, начинается ли строка line с указанных символов
     * @param prefix символы для проверки строки
     * @return совпало или нет
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i < value.length; i++) {
            if (value[i] != data[i]) {
                result = false;
            }
        }
        return result;
    }
}
