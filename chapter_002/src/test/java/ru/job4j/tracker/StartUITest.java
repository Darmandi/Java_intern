package ru.job4j.tracker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    PrintStream stdout = System.out;
    ByteArrayOutputStream out = new ByteArrayOutputStream();

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
        System.setOut(stdout);
    }
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
    @Test
    public void whenCheckConsoleOutput() {
        Input input = new StubInput(new String[]{"6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(System.lineSeparator())
                .append("Меню.").append(System.lineSeparator())
                .append("0. Add new Item").append(System.lineSeparator())
                .append("1. Show all items").append(System.lineSeparator())
                .append("2. Edit item").append(System.lineSeparator())
                .append("3. Delete item").append(System.lineSeparator())
                .append("4. Find item by Id").append(System.lineSeparator())
                .append("5. Find items by name").append(System.lineSeparator())
                .append("6. Exit Program").append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()));
    }
    @Test
    public void whenCheckConsoleOutputAddObject() {
        Input input = new StubInput(new String[]{"0", "name4", "desc4", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(System.lineSeparator())
                .append("Меню.").append(System.lineSeparator())
                .append("0. Add new Item").append(System.lineSeparator())
                .append("1. Show all items").append(System.lineSeparator())
                .append("2. Edit item").append(System.lineSeparator())
                .append("3. Delete item").append(System.lineSeparator())
                .append("4. Find item by Id").append(System.lineSeparator())
                .append("5. Find items by name").append(System.lineSeparator())
                .append("6. Exit Program").append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("------------ Добавление новой заявки --------------").append(System.lineSeparator())
                .append("Новая заявка с ID: ").append(tracker.getAll()[3].getID()).append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Меню.").append(System.lineSeparator())
                .append("0. Add new Item").append(System.lineSeparator())
                .append("1. Show all items").append(System.lineSeparator())
                .append("2. Edit item").append(System.lineSeparator())
                .append("3. Delete item").append(System.lineSeparator())
                .append("4. Find item by Id").append(System.lineSeparator())
                .append("5. Find items by name").append(System.lineSeparator())
                .append("6. Exit Program").append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()));
    }
    @Test
    public void whenCheckConsoleOutputUpdateObject() {
        Input input = new StubInput(new String[]{"2", item1.getID(), "edited name", "edited desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(System.lineSeparator())
                .append("Меню.").append(System.lineSeparator())
                .append("0. Add new Item").append(System.lineSeparator())
                .append("1. Show all items").append(System.lineSeparator())
                .append("2. Edit item").append(System.lineSeparator())
                .append("3. Delete item").append(System.lineSeparator())
                .append("4. Find item by Id").append(System.lineSeparator())
                .append("5. Find items by name").append(System.lineSeparator())
                .append("6. Exit Program").append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("------------ Изменение заявки --------------").append(System.lineSeparator())
                .append("Заявка отредактирована. ID заявки: ").append(item1.getID()).append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Меню.").append(System.lineSeparator())
                .append("0. Add new Item").append(System.lineSeparator())
                .append("1. Show all items").append(System.lineSeparator())
                .append("2. Edit item").append(System.lineSeparator())
                .append("3. Delete item").append(System.lineSeparator())
                .append("4. Find item by Id").append(System.lineSeparator())
                .append("5. Find items by name").append(System.lineSeparator())
                .append("6. Exit Program").append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()));
    }
    @Test
    public void whenCheckConsoleOutputDeleteObject() {
        String id2 = item2.getID();
        Input input = new StubInput(new String[]{"3", id2, "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(System.lineSeparator())
                .append("Меню.").append(System.lineSeparator())
                .append("0. Add new Item").append(System.lineSeparator())
                .append("1. Show all items").append(System.lineSeparator())
                .append("2. Edit item").append(System.lineSeparator())
                .append("3. Delete item").append(System.lineSeparator())
                .append("4. Find item by Id").append(System.lineSeparator())
                .append("5. Find items by name").append(System.lineSeparator())
                .append("6. Exit Program").append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("------------ Удаление заявки --------------").append(System.lineSeparator())
                .append("Заявка с ID ").append(id2).append(" удалена").append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Меню.").append(System.lineSeparator())
                .append("0. Add new Item").append(System.lineSeparator())
                .append("1. Show all items").append(System.lineSeparator())
                .append("2. Edit item").append(System.lineSeparator())
                .append("3. Delete item").append(System.lineSeparator())
                .append("4. Find item by Id").append(System.lineSeparator())
                .append("5. Find items by name").append(System.lineSeparator())
                .append("6. Exit Program").append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()));
    }
    @Test
    public void whenCheckConsoleOutputShowAllObjects() {
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(new String(out.toByteArray()), is(new StringBuilder()
                .append(System.lineSeparator())
                .append("Меню.").append(System.lineSeparator())
                .append("0. Add new Item").append(System.lineSeparator())
                .append("1. Show all items").append(System.lineSeparator())
                .append("2. Edit item").append(System.lineSeparator())
                .append("3. Delete item").append(System.lineSeparator())
                .append("4. Find item by Id").append(System.lineSeparator())
                .append("5. Find items by name").append(System.lineSeparator())
                .append("6. Exit Program").append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("------------ Все заявки --------------").append(System.lineSeparator())
                .append("ID: ").append(item1.getID()).append(" Имя заявки: ").append(item1.getName()).append(System.lineSeparator())
                .append("ID: ").append(item2.getID()).append(" Имя заявки: ").append(item2.getName()).append(System.lineSeparator())
                .append("ID: ").append(item3.getID()).append(" Имя заявки: ").append(item3.getName()).append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Меню.").append(System.lineSeparator())
                .append("0. Add new Item").append(System.lineSeparator())
                .append("1. Show all items").append(System.lineSeparator())
                .append("2. Edit item").append(System.lineSeparator())
                .append("3. Delete item").append(System.lineSeparator())
                .append("4. Find item by Id").append(System.lineSeparator())
                .append("5. Find items by name").append(System.lineSeparator())
                .append("6. Exit Program").append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()));
    }
}
