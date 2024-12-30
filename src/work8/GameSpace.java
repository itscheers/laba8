package work8;

/**
 * The GameSpace class represents the game area (field) where tokens are placed.
 */
public class GameSpace {
    private int width;
    private int height;

    /**
     * Constructor with width and height parameters.
     *
     * @param width  the width of the game space
     * @param height the height of the game space
     */
    public GameSpace(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Stub method that simulates rendering the game space.
     */
    public void draw() {
        System.out.println("GameSpace: Rendering game space with dimensions "
                + width + "x" + height);
    }

    /**
     * Stub method that simulates resizing the game space.
     *
     * @param newWidth  the new width of the game space
     * @param newHeight the new height of the game space
     */
    public void resize(int newWidth, int newHeight) {
        this.width = newWidth;
        this.height = newHeight;
        System.out.println("GameSpace: Resized to " + newWidth + "x" + newHeight);
    }

    /**
     * Returns the width of the game space.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Returns the height of the game space.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }
}
