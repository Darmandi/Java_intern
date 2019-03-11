package ru.job4j.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;

public class SortUserTest {
    SortUser sorted = new SortUser();
    List<User> list = new ArrayList<>();
    User user1 = new User("Anton", 30);
    User user2 = new User("Boris", 20);
    User user3 = new User("Dmitrii", 40);
    User user4 = new User("Fedor", 40);
    User user5 = new User("Dmitrii", 50);

    @Test
    public void threeNameList() {
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Set<User> result = sorted.sort(list);
        Assert.assertThat(result, is(new TreeSet(Arrays.asList(user2, user1, user3))));
    }
    @Test
    public void fiveNameList() {
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        Set<User> result = sorted.sort(list);
        Assert.assertThat(result, is(new TreeSet(Arrays.asList(user2, user1, user3, user4, user5))));
    }
}
