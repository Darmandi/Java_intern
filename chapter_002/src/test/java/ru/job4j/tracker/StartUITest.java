package ru.job4j.tracker;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    Tracker tracker = new Tracker();
    Item item1 = tracker.add(new Item("name1", "desc1"));
    Item item2 = tracker.add(new Item("name1", "desc2"));
    Item item3 = tracker.add(new Item("name3", "desc3"));

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "name4", "desc4", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll()[3].getName(), is("name4"));
    }
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Input input = new StubInput(new String[]{"2", item1.getID(), "edited name", "edited desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByID(item1.getID()).getName(), is("edited name"));
    }
    @Test
    public void whenDeleteThenTrackerHasNoValue() {
        Input input = new StubInput(new String[]{"3", item2.getID(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll(), is(new Item[]{item1, item3}));
    }
    @Test
    public void whenFindByID() {
        Input input = new StubInput(new String[]{"4", item3.getID(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByID(item3.getID()).getName(), is("name3"));
    }
    @Test
    public void whenFindByNameThenFirstAndSecond() {
        Input input = new StubInput(new String[]{"5", "name1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findByName("name1"), is(new Item[]{item1, item2}));
    }
    @Test
    public void whenExitThantrackerHasNoValue() {
        Input input = new StubInput(new String[]{"6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.getAll(), is(new Item[]{item1, item2, item3}));
    }
}
