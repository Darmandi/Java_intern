package ru.job4j.loop;

/**
 * @author Dmitrii Saraev
 * @version 1
 * @since 5.03.2018
 */

public class Board {

    /**
     * Создает шахматную доску из символов "X" и " ".
     * @param width ширина доски
     * @param height высота доски
     * @return символьная строка шириной width и высотой height.
     */

    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int j = 0; j < height; j++ ) {
            for (int i = 0; i < width; i++ ) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}