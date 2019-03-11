package ru.job4j.sort;

/**
 * @author Dmitrii Saraev
 * @version 0.1
 */

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortUser {
    /**
     * Метод возвращает список User отсортированных по возрасту
     * @param list список User
     * @return отсортированный список
     */
    public Set<User> sort(List<User> list) {
        return new TreeSet<User>(list);
    }
}
