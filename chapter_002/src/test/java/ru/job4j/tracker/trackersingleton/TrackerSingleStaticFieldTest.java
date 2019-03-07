package ru.job4j.tracker.trackersingleton;

import org.junit.Test;
import ru.job4j.tracker.Item;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerSingleStaticFieldTest {
    TrackerSingleStaticField tracker = TrackerSingleStaticField.getInstance();
    Item item1 = tracker.add(new Item("name1", "desc1"));
    Item item2 = tracker.add(new Item("name2", "desc2"));
    Item item3 = tracker.add(new Item("name3", "desc3"));

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        assertThat(tracker.getAll(), is(Arrays.asList(item1, item2, item3)));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Item next = new Item("test2", "testDescription2");
        next.setID(item1.getID());
        tracker.replace(item1.getID(), next);
        assertThat(tracker.findByID(item1.getID()).getName(), is("test2"));
    }
    @Test
    public void whenDeleteSecondThenReturnFirstThird() {
        tracker.delete(item2.getID());
        assertThat(tracker.getAll(), is(Arrays.asList(item1, item3)));
        assertThat(tracker.delete("1"), is(false));
    }
    @Test
    public void whenFindByNameThird() {
        assertThat(tracker.findByName("name3"), is(Arrays.asList(item3)));
    }
    @Test
    public void whenFindByIDSecond() {
        assertThat(tracker.findByID(item2.getID()), is(item2));
    }
}
