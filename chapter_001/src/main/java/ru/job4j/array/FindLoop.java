package ru.job4j.array;

/**
 * @author Dmtrii Saraev
 * @version 1
 * @since 7.03.2018
 */

public class FindLoop {

    public int indexOf(int[] data, int elem) {
        int rsl = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == elem) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}
