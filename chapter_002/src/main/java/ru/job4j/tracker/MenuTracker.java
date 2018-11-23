package ru.job4j.tracker;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Dmotrii Saraev
 * @version 1
 */


public class MenuTracker {
    private Input input;
    private Tracker tracker;
    private List<UserAction> actions = new ArrayList<>();

    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    public int getActionsLength() {
        return this.actions.size();
    }

    public void fillActions() {
        this.actions.add(new AddItem());
        this.actions.add(new ShowItems());
        this.actions.add(new MenuTracker.EditItem());
        this.actions.add(new MenuTracker.DeleteItem());
        this.actions.add(new FindItemById());
        this.actions.add(new FindItemsByName());
    }


    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }


    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {
        @Override
        public int key() {
            return 0;
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Adding new item --------------");
            String name = input.ask("Please, provide item name:");
            String desc = input.ask("Please, provide item description:");
            Item item = new Item(name, desc);
            tracker.add(item);
            System.out.println("------------ New Item with Id : " + item.getID() + "Name : " + item.getName() + "Description : " + item.desc);
        }
        @Override
        public String info() {
            return "0. Add new Item.";
        }
    }

    private class ShowItems implements UserAction {
        @Override
        public int key() {
            return 1;
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ All items --------------");
            Item[] items = tracker.getAll();
            if (items.length > 0) {
                for (Item item : items) {
                    System.out.println(item.toString());
                }
            } else {
                System.out.println("No items found");
            }
        }
        @Override
        public String info() {
            return "1. Show all items.";
        }
    }

    public static class EditItem implements UserAction{
        @Override
        public int key() {
            return 2;
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Edit item --------------");
            String id = input.ask("Enter old item's ID:");
            String name = input.ask("Enter new item's ID:");
            String desc = input.ask("Enter description:");
            Item item = new Item(name, desc);
            boolean result = tracker.replace(id, item);
            if (result) {
                System.out.println("Item edited. Item's ID: " + item.getID());
            } else {
                System.out.println("No items found");
            }
        }
        @Override
        public String info() {
            return "2. Edit item.";
        }
    }

    public static class DeleteItem implements UserAction{
        @Override
        public int key() {
            return 3;
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Delete item --------------");
            String id = input.ask("Enter item's ID:");
            boolean result = tracker.delete(id);
            if (result) {
                System.out.println("Item with ID " + id + " has been deleted");
            } else {
                System.out.println("No items found");
            }
        }
        @Override
        public String info() {
            return "3. Delete item.";
        }
    }
}

    class FindItemById implements UserAction {
    @Override
    public int key() {
        return 4;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find item by ID--------------");
        String id = input.ask("Enter item's ID:");
        Item itemTemp = tracker.findByID(id);
        if (itemTemp != null) {
            System.out.println(itemTemp.toString());
        } else {
            System.out.println("No items found");
        }
    }
    @Override
    public String info() {
        return "4. Find item by ID.";
    }
}

class FindItemsByName implements UserAction {
    @Override
    public int key() {
        return 5;
    }
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println("------------ Find item by name--------------");
        String name = input.ask("Enter item's name:");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item.toString());
            }
        } else {
            System.out.println("No items found");
        }
    }
    @Override
    public String info() {
        return "5. Find item by name.";
    }
}