package ru.job4j.sort;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class DepartamentSortTest {
    DepartamentSort departament = new DepartamentSort();
    List<Departament> list = new ArrayList<>();
    Departament dep1 = new Departament("K1", "SK1");
    Departament dep2 = new Departament("K1", "SK2");
    Departament dep3 = new Departament("K1", "SK1", "SSK1");
    Departament dep4 = new Departament("K1", "SK1", "SSK2");
    Departament dep5 = new Departament("K2");
    Departament dep6 = new Departament("K2", "SK1", "SSK1");
    Departament dep7 = new Departament("K2", "SK1", "SSK2");

    @Before
    public void fillList() {
        list.add(dep5);
        list.add(dep4);
        list.add(dep1);
        list.add(dep3);
        list.add(dep7);
        list.add(dep6);
        list.add(dep2);
        departament.addDepartament(list);
    }

    @Test
    public void ascSort() {
        Set<Departament> result = departament.sortAsc(list);
        Assert.assertThat(result, Is.is(new TreeSet(Arrays.asList(
                new Departament("K1"),
                new Departament("K1", "SK1"),
                new Departament("K1", "SK1", "SSK1"),
                new Departament("K1", "SK1", "SSK2"),
                new Departament("K1", "SK2"),
                new Departament("K2"),
                new Departament("K2", "SK1"),
                new Departament("K2", "SK1", "SSK1"),
                new Departament("K2", "SK1", "SSK2")))));
    }

    @Test
    public void descSort() {
        List<Departament> result = departament.sortDesc(list);
        Set<Departament> re = new TreeSet<>(result);
        Assert.assertThat(re, Is.is(new TreeSet(Arrays.asList(
                new Departament("K2"),
                new Departament("K2", "SK1"),
                new Departament("K2", "SK1", "SSK2"),
                new Departament("K2", "SK1", "SSK1"),
                new Departament("K1"),
                new Departament("K1", "SK2"),
                new Departament("K1", "SK1"),
                new Departament("K1", "SK1", "SSK2"),
                new Departament("K1", "SK1", "SSK1")))));
    }
}
