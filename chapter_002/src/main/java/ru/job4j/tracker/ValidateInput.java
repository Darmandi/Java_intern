package ru.job4j.tracker;


/**
 * @author Dmitrii Saraev
 * @version 1
 */

public class ValidateInput extends ConsoleInput {
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Select key from menu");
            } catch (NumberFormatException nfe) {
                System.out.println("Enter validate data again");
            }
        } while (invalid);
        return value;
    }
}