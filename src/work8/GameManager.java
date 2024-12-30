package work8;

import java.util.ArrayList;
import java.util.List;

/**
 * The GameManager class manages the game.
 * Implements the Singleton pattern to ensure only one instance exists.
 */
public class GameManager {

    /**
     * Static private variable to store the single instance of GameManager.
     */
    private static GameManager instance;

    /**
     * The game space object.
     */
    private GameSpace gameSpace;

    /**
     * The list of game tokens.
     */
    private List<GameToken> tokens;

    /**
     * Private default constructor (to prevent object creation outside the class).
     */
    private GameManager() {
        tokens = new ArrayList<>();
    }

    /**
     * Method to get the single instance of GameManager.
     * If the instance has not been created yet, it will be instantiated.
     *
     * @return the single instance of GameManager
     */
    public static synchronized GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
            System.out.println("GameManager: New instance created.");
        }
        return instance;
    }

    /**
     * Initializes the game space.
     *
     * @param width  the width of the game space
     * @param height the height of the game space
     */
    public void initGameSpace(int width, int height) {
        this.gameSpace = new GameSpace(width, height);
        System.out.println("GameManager: Game space initialized with dimensions "
                + width + "x" + height);
    }

    /**
     * Adds a game token to the list.
     *
     * @param token the new game token
     */
    public void addToken(GameToken token) {
        tokens.add(token);
        System.out.println("GameManager: Token with id=" + token.getId() + " added.");
    }

    /**
     * Removes a game token from the list.
     *
     * @param token the game token to remove
     */
    public void removeToken(GameToken token) {
        tokens.remove(token);
        System.out.println("GameManager: Token with id=" + token.getId() + " removed.");
    }

    /**
     * Prints information about all tokens to the console.
     */
    public void printTokens() {
        System.out.println("GameManager: List of tokens:");
        for (GameToken token : tokens) {
            System.out.println("  - Token id=" + token.getId()
                    + " at position (" + token.getX() + ", " + token.getY() + ")");
        }
    }

    /**
     * Returns the game space object.
     *
     * @return GameSpace
     */
    public GameSpace getGameSpace() {
        return gameSpace;
    }

    /**
     * Example business method that starts rendering the game.
     */
    public void renderGame() {
        System.out.println("GameManager: Rendering the game...");
        if (gameSpace != null) {
            gameSpace.draw();
        }
        for (GameToken token : tokens) {
            token.draw();
        }
    }
}
