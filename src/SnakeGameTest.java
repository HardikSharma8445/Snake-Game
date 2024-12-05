import org.junit.Test;
import static org.junit.Assert.*;

public class SnakeGameTest {
    @Test
    public void testGameInitialization() {
        SnakeGame game = new SnakeGame();
        assertNotNull(game);
    }
}
