package ru.job4j.list;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CycleListTest {
    private Node first;
    private Node two;
    private Node third;
    private Node four;
    private CycleList finder;

    @Before
    public void beforeTest() {
        first = new Node(1);
        two = new Node(2);
        third = new Node(3);
        four = new Node(4);
        finder = new CycleList();
    }

    @Test
    public void whenHasCycle() {
        first.next = two;
        two.next = third;
        third.next = four;
        four.next = first;
        assertThat(finder.hasCycle(first), is(true));
    }

    @Test
    public void whenHasCycle2() {
        first.next = two;
        two.next = third;
        third.next = two;
        four.next = null;
        assertThat(finder.hasCycle(first), is(true));
    }

    @Test
    public void whenHasNotCycle() {
        first.next = two;
        two.next = third;
        third.next = four;
        four.next = null;
        assertThat(finder.hasCycle(first), is(false));
    }
}
