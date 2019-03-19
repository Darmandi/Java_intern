package ru.job4j.sort;

import java.util.Comparator;

/**
 * Реализация компаратора
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class ListCompare implements Comparator<String> {
    /**
     * Метод сравнивает две строки посимвольно
     * @param left первая строка
     * @param right вторая строка
     * @return результат сравнения
     */
    @Override
    public int compare(String left, String right) {
        int length = left.length() > right.length() ? right.length() : left.length();
        int result = 0;
        for (int i = 0; i < length; i++) {
            int res = Integer.compare(left.charAt(i), right.charAt(i));
            if (res != 0) {
                result = res;
                break;
            }
        }
        result = result != 0 ? result : Integer.compare(left.length(), right.length());
        return result;
    }
}
