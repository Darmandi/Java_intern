package ru.job4j.array;

/** Слово в слове
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class ArrayCharInArrayChar {
    /**
     * Поверяет входит ли первое слово во второе слово
     * @param origin второе слово
     * @param sub первое слово
     * @return входит или нет
     */
    public boolean contains(String origin, String sub) {
        boolean result = false;
        int i = 0;
        int j = 0;
        int count = 0;
        char[] valueOrigin = origin.toCharArray();
        char[] valueSub = sub.toCharArray();
        while (i < valueSub.length && j < valueOrigin.length) {
                if (valueSub[i] != valueOrigin[j]) {
                    count = 0;
                    j++;
                } else {
                        count++;
                        if (count == valueSub.length) {
                            result = true;
                        }
                        i++;
                        j++;
                    }
            }
        return result;
    }
}