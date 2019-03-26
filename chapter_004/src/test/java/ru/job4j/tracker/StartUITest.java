package ru.job4j.tracker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    ByteArrayOutputStream out = new ByteArrayOutputStream();
    //функция вывода данных
    private final Consumer<String> output = new Consumer<String>() {
        private final PrintStream stdout = new PrintStream(out);
        private String printString;
        @Override
        public void accept(String s) {
            stdout.println(s);
            this.printString = this.printString == null ? s : this.printString + "\n" + s;
        }
        @Override
        public String toString() {
            return this.printString + "\n";
        }
    };

    String menu = new StringBuilder()
            .append("0. Add new Item").append("\n")
            .append("1. Show all items").append("\n")
            .append("2. Edit item").append("\n")
            .append("3. Delete item").append("\n")
            .append("4. Find item by ID").append("\n")
            .append("5. Find item by name").append("\n")
            .toString();

    Tracker tracker = new Tracker();
    Item item1 = tracker.add(new Item("name1", "desc1"));
    Item item2 = tracker.add(new Item("name1", "desc2"));
    Item item3 = tracker.add(new Item("name3", "desc3"));

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(out));
    }
    @After
    public void backOutput() {
        System.setOut(System.out);
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Input input = new StubInput(new String[]{"0", "name4", "desc4", "y"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.getAll().get(3).getName(), is("name4"));
    }
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Input input = new StubInput(new String[]{"2", item1.getID(), "edited name", "edited desc", "y"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.findByID(item1.getID()).getName(), is("edited name"));
    }
    @Test
    public void whenDeleteThenTrackerHasNoValue() {
        Input input = new StubInput(new String[]{"3", item2.getID(), "y"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.getAll(), is(Arrays.asList(item1, item3)));
    }
    @Test
    public void whenFindByID() {
        Input input = new StubInput(new String[]{"4", item3.getID(), "y"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.findByID(item3.getID()).getName(), is("name3"));
    }
    @Test
    public void whenFindByNameThenFirstAndSecond() {
        Input input = new StubInput(new String[]{"5", "name1", "y"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.findByName("name1"), is(Arrays.asList(item1, item2)));
    }

    @Test
    public void whenCheckConsoleOutputAddObject() {
        Input input = new StubInput(new String[]{"0", "name4", "desc4", "y"});
        new StartUI(input, tracker, output).init();
        assertThat(this.output.toString(), is(new StringBuilder()
                .append(menu)
                .append("------------ Adding new item --------------").append("\n")
                .append("New Item with Id : ").append(tracker.getAll().get(3).getID()).append("\n")
                .toString()));
    }
    @Test
    public void whenCheckConsoleOutputUpdateObject() {
        Input input = new StubInput(new String[]{"2", item1.getID(), "edited name", "edited desc", "y"});
        new StartUI(input, tracker, output).init();
        assertThat(this.output.toString(), is(new StringBuilder()
                .append(menu)
                .append("------------ Edit item --------------").append("\n")
                .append("Item edited. Item's ID: ").append(item1.getID()).append("\n")
                .toString()));
    }
    @Test
    public void whenCheckConsoleOutputDeleteObject() {
        String id2 = item2.getID();
        Input input = new StubInput(new String[]{"3", id2, "y"});
        new StartUI(input, tracker, output).init();
        assertThat(this.output.toString(), is(new StringBuilder()
                .append(menu)
                .append("------------ Delete item --------------").append("\n")
                .append("Item with ID ").append(id2).append(" was deleted").append("\n")
                .toString()));
    }
}
