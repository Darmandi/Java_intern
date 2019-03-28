package ru.job4j.adress;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Список адресов
 * @author Дмитрий Сараев (guitarpro4@mail.ru)
 * @version 1
 */
public class AdressList {

    /**
     * Создает список адрессов всех клиентов
     * @param profiles список клиентов
     * @return список адрессов
     */
    public List<Profile.Address> collect(List<Profile> profiles) {
        return profiles.stream().map(i -> i.getAddress()).collect(Collectors.toList());
    }
}
