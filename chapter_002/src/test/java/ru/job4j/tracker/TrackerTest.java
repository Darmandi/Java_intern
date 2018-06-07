package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription1");
        tracker.add(item1);
        Item item2 = new Item("test2", "testDescription2");
        tracker.add(item2);
        assertThat(tracker.getAll(), is(new Item[]{item1, item2}));
    }
    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription");
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2");
        next.setID(previous.getID());
        tracker.replace(previous.getID(), next);
        assertThat(tracker.findByID(previous.getID()).getName(), is("test2"));
    }
    @Test
    public void whenDeleteSecondThenReturnFirstThird() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription1");
        tracker.add(item1);
        Item item2 = new Item("test2", "testDescription2");
        tracker.add(item2);
        Item item3 = new Item("test3", "testDescription3");
        tracker.add(item3);
        tracker.delete(item2.getID());
        assertThat(tracker.getAll(), is(new Item[]{item1, item3}));
    }
    @Test
    public void whenFindByNameThird() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription1");
        tracker.add(item1);
        Item item2 = new Item("test2", "testDescription2");
        tracker.add(item2);
        Item item3 = new Item("test3", "testDescription3");
        tracker.add(item3);
        assertThat(tracker.findByName("test3"), is(new Item[]{item3}));
    }
    @Test
    public void whenFindByIDSecond() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1", "testDescription1");
        tracker.add(item1);
        Item item2 = new Item("test2", "testDescription2");
        tracker.add(item2);
        Item item3 = new Item("test3", "testDescription3");
        tracker.add(item3);
        assertThat(tracker.findByID(item2.getID()), is(item2));
    }

}
