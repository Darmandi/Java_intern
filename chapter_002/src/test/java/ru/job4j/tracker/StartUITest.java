package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "name1", "desc1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[0].getName(), is("name1"));
    }
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("name", "desc"));
        Input input = new StubInput(new String[]{"2", item.getID(), "edited name", "edited desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByID(item.getID()).getName(), is("edited name"));
    }
    @Test
    public void whenDeleteThenTrackerHasNoValue() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("name1", "desc1"));
        Item item2 = tracker.add(new Item("name2", "desc2"));
        Item item3 = tracker.add(new Item("name3", "desc3"));
        Input input = new StubInput(new String[]{"3", item2.getID(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll(), is(new Item[]{item1, item3}));
    }
    @Test
    public void whenFindByID() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("name1", "desc1"));
        Item item2 = tracker.add(new Item("name2", "desc2"));
        Item item3 = tracker.add(new Item("name3", "desc3"));
        Input input = new StubInput(new String[]{"4", item2.getID(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByID(item2.getID()).getName(), is("name2"));
    }
    @Test
    public void whenFindByNameThenFirstAndSecond() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("name1", "desc1"));
        Item item2 = tracker.add(new Item("name1", "desc2"));
        Item item3 = tracker.add(new Item("name3", "desc3"));
        Input input = new StubInput(new String[]{"5", "name1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("name1"), is(new Item[]{item1, item2}));
    }
    @Test
    public void whenExitThantrackerHasNoValue() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll(), is(new Item[0]));
    }
}
