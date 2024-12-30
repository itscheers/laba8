package work8;

/**
 * The GameToken class represents a game token with coordinates on the game field.
 */
public class GameToken {
    private static int globalIdCounter = 0;

    private int id;
    private int x;
    private int y;

    /**
     * Constructor creates a token with an automatically generated id
     * and coordinates (x, y).
     *
     * @param x the x-coordinate of the token
     * @param y the y-coordinate of the token
     */
    public GameToken(int x, int y) {
        this.id = ++globalIdCounter;
        this.x = x;
        this.y = y;
    }

    /**
     * Stub method that simulates moving the token.
     *
     * @param newX the new x-coordinate of the token
     * @param newY the new y-coordinate of the token
     */
    public void moveTo(int newX, int newY) {
        System.out.println("GameToken (id=" + id + "): Moved from (" + x + ", " + y
                + ") to (" + newX + ", " + newY + ")");
        this.x = newX;
        this.y = newY;
    }

    /**
     * Stub method that simulates rendering the token.
     */
    public void draw() {
        System.out.println("GameToken (id=" + id + "): Rendering at position ("
                + x + ", " + y + ")");
    }

    /**
     * Returns the unique identifier of the token.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the x-coordinate of the token.
     *
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Returns the y-coordinate of the token.
     *
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }
}
