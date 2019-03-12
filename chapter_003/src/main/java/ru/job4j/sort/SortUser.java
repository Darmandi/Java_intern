package ru.job4j.sort;

import java.util.*;
/**
 * @author Dmitrii Saraev
 * @version 0.1
 */

public class SortUser {
    /**
     * Метод возвращает список User отсортированных по возрасту
     * @param list список User
     * @return отсортированный список
     */
    public Set<User> sort(List<User> list) {
        return new TreeSet<User>(list);
    }

    /**
     * Метод возвращает список User отсортированных по длине имени.
     * Для сортировки переопределяем компаратор в методе Collections.sort
     * @param list список User
     * @return отсортированный список
     */
    public List<User> sortNameLength(List<User> list) {
        Collections.sort(list, new Comparator<User>() {
            public int compare(User o1, User o2) {
                return Integer.compare(o1.getName().length(), o2.getName().length());
            }
        });
        return new ArrayList<>(list);
    }

    /**
     * Метод возвращает список User отсортированных по имени и возрасту.
     * Для сортировки переопределяем компаратор в методе Collections.sort
     * @param list список User
     * @return отсортированный список
     */
    public List<User> sortByAllFields(List<User> list) {
        Collections.sort(list, new Comparator<User>() {
            public int compare(User o1, User o2) {
                int result = o1.getName().compareTo(o2.getName());
                return result != 0 ? result : Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return new ArrayList<>(list);
    }
}
