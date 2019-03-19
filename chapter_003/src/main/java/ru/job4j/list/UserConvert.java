package ru.job4j.list;

import java.util.HashMap;
import java.util.List;

/**
 * Конвертация list в map
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class UserConvert {

    /**
     * Метод преобразует список с User в отображение по ключу id
     * @param list список с User
     * @return отображение
     */
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User user: list) {
            result.put(user.getId(), user);
        }
        return  result;
    }
}
