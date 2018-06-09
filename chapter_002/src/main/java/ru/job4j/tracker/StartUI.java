package ru.job4j.tracker;
import java.util.Arrays;

/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class StartUI {
    /**
     * Константы меню
     */
    private static final String ADD = "0";
    private static final String ALL = "1";
    private static final String EDIT = "2";
    private static final String DELETE = "3";
    private static final String FINDID = "4";
    private static final String FINDNAME = "5";
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню: ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (ALL.equals(answer)) {
                this.showItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDID.equals(answer)) {
                this.findItemID();
            } else if (FINDNAME.equals(answer)) {
                this.findItemName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки:");
        String desc = this.input.ask("Введите описание заявки:");
        Item item = new Item(name, desc);
        this.tracker.add(item);
        System.out.println("Новая заявка с ID: " + item.getID());
    }

    /**
     * Метод реализует отображение всех заявок в хранилище.
     */
    private void showItems() {
        System.out.println("------------ Все заявки --------------");
        for (Item item : this.tracker.getAll()) {
            System.out.println("ID: " + item.getID() + " Имя заявки: " + item.getName());
        }
    }

    /**
     * Метод реализует изменение заявки.
     */
    private void editItem() {
        System.out.println("------------ Изменение заявки --------------");
        String id = this.input.ask("Введите ID старой заявки:");
        String name = this.input.ask("Введите имя новой заявки:");
        String desc = this.input.ask("Введите описание новой заявки:");
        Item item = new Item(name, desc);
        this.tracker.replace(id, item);
        System.out.println("Новая заявка с ID: " + item.getID());
    }

    /**
     * Метод реализует удаление заявки.
     */
    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите ID заявки:");
        this.tracker.delete(id);
    }

    /**
     * Метод реализует поиск заявки по ID.
     */
    private void findItemID() {
        System.out.println("------------ Поиск заявки по ID--------------");
        String id = this.input.ask("Введите ID заявки:");
        System.out.println("ID: " + this.tracker.findByID(id).getID() + " Имя заявки: " + this.tracker.findByID(id).getName());
    }

    /**
     * Метод реализует поиск заявки по имени.
     */
    private void findItemName() {
        System.out.println("------------ Поиск заявки по имени--------------");
        String name = this.input.ask("Введите имя заявки:");
        for (Item item : this.tracker.findByName(name)) {
            System.out.println("ID: " + item.getID() + " Имя заявки: " + item.getName());
        }
    }

    private void showMenu() {
        System.out.println("\nМеню.");
        System.out.println("0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3. Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program\n");
    }

    /**
     * Запускт программы
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
