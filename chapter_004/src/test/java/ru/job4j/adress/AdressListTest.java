package ru.job4j.adress;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdressListTest {
    List<Profile> clients = new ArrayList<>();
    AdressList adresses = new AdressList();
    Profile.Address add1 = new Profile.Address("Moscow", "Red Square", 1, 1);
    Profile.Address add2 = new Profile.Address("St. Petersburg", "Fontanka", 2, 2);
    Profile.Address add3 = new Profile.Address("Vladimir", "Lenina", 3, 3);
    Profile.Address add4 = new Profile.Address("Novgorod", "Sverdlova", 4, 4);
    Profile.Address add5 = new Profile.Address("Moscow", "Red Square", 1, 1);

    @Before
    public void fillList() {
        clients.add(new Profile(add1));
        clients.add(new Profile(add2));
        clients.add(new Profile(add3));
        clients.add(new Profile(add4));
        clients.add(new Profile(add5));
    }

    @Test
    public void collect() {
        Assert.assertThat(adresses.collect(clients), is(Arrays.asList(add1, add2, add3, add4, add5)));
    }

    @Test
    public void sortDistinct() {
        Assert.assertThat(adresses.sortByCity(clients), is(Arrays.asList(add1, add4, add2, add3)));
    }
}
