package game;

import java.awt.*;
import java.util.HashMap;

public class Constants {
    // board size
    public static final int ROWS = 6;
    public static final int COLUMNS = 7;
    // how many discs to win
    public static final int WIN = 4;
    // the discs
    public static final char XPLAYER = 'X';
    public static final char OPLAYER = 'O';
    public static final char EMPTY = ' ';
    // the main menu
    public static final char PLAY = '1';
    public static final char PLAYCOMPUTER = '2';
    public static final char QUIT = '0';
    // the board menu
    public static final char STANDARD = '1';
    public static final char CUSTOM = '2';
    // the level menu
    public static final char EASY = '1';
    public static final char HARD = '2';

    public static final HashMap<String, Color> colorList = new HashMap<String, Color>(){{
        put("cyan", Color.CYAN);
        put("gray", Color.GRAY);
        put("green", Color.GREEN);
        put("orange", Color.ORANGE);
        put("pink", Color.PINK);
        put("yellow", Color.YELLOW);
    }};
}
