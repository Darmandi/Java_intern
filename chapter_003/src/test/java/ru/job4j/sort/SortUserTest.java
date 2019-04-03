package ru.job4j.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;

public class SortUserTest {
    SortUser sorted = new SortUser();
    List<User> list;
    User user1 = new User("Anton", 30);
    User user2 = new User("Boris", 20);
    User user3 = new User("Dmitrii", 40);
    User user4 = new User("Fedor", 40);
    User user5 = new User("Dmitrii", 50);
    User user6 = new User("Vladimir", 50);

    @Test
    public void threeNameList() {
        list = List.of(
        user1,
        user2,
        user3);
        Set<User> result = sorted.sort(list);
        Assert.assertThat(result, is(Set.of(user2, user1, user3)));
    }
    @Test
    public void fiveNameList() {
        list = List.of(
        user1,
        user2,
        user3,
        user4,
        user5);
        Set<User> result = sorted.sort(list);
        Assert.assertThat(result, is(Set.of(user2, user1, user3, user4, user5)));
    }
    @Test
    public void nameLengthTest() {
        list = new ArrayList<>(List.of(
        user3,
        user2,
        user6,
        user1));
        List<User> result = sorted.sortNameLength(list);
        Assert.assertThat(result, is(List.of(user2, user1, user3, user6)));
    }
    @Test
    public void allFieldsTest() {
        list = new ArrayList<>(List.of(
        user3,
        user2,
        user6,
        user5,
        user4,
        user1));
        List<User> result = sorted.sortByAllFields(list);
        Assert.assertThat(result, is(List.of(user1, user2, user3, user5, user4, user6)));
    }
}
