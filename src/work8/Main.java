package work8;

/**
 * The Main class demonstrates the use of the GameManager Singleton and other
 * components of the game system.
 */
public class Main {
    public static void main(String[] args) {
        GameManager manager = GameManager.getInstance();

        manager.initGameSpace(800, 600);

        manager.addToken(new GameToken(10, 10));
        manager.addToken(new GameToken(50, 75));
        manager.addToken(new GameToken(200, 300));

        manager.printTokens();

        GameManager anotherManager = GameManager.getInstance();
        System.out.println("Singleton check: " + (manager == anotherManager));

        manager.renderGame();
    }
}
