import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Chandrayaan3Test {

    @Test
    public void testExampleCommands() {
        Chandrayaan3 chandrayaan3 = new Chandrayaan3();
        char[] commands = {'f', 'r', 'u', 'b', 'l'};
        chandrayaan3.executeCommands(commands);

        // Check the final position and direction
        assertEquals(0, chandrayaan3.getX());
        assertEquals(1, chandrayaan3.getY());
        assertEquals(-1, chandrayaan3.getZ());
        assertEquals("N", chandrayaan3.getDirection());
    }

    @Test
    public void testMoveForwardAndBackward() {
        Chandrayaan3 chandrayaan3 = new Chandrayaan3();

        // Move forward
        chandrayaan3.executeCommands(new char[]{'f'});
        assertEquals(0, chandrayaan3.getX());
        assertEquals(1, chandrayaan3.getY());
        assertEquals(0, chandrayaan3.getZ());

        // Move backward
        chandrayaan3.executeCommands(new char[]{'b'});
        assertEquals(0, chandrayaan3.getX());
        assertEquals(0, chandrayaan3.getY());
        assertEquals(0, chandrayaan3.getZ());
    }

    @Test
    public void testTurnLeftAndRight() {
        Chandrayaan3 chandrayaan3 = new Chandrayaan3();

        // Turn left
        chandrayaan3.executeCommands(new char[]{'l'});
        assertEquals("W", chandrayaan3.getDirection());

        // Turn right
        chandrayaan3.executeCommands(new char[]{'r'});
        assertEquals("N", chandrayaan3.getDirection());
    }

    @Test
    public void testTurnUpAndDown() {
        Chandrayaan3 chandrayaan3 = new Chandrayaan3();

        // Turn up
        chandrayaan3.executeCommands(new char[]{'u'});
        assertEquals("Up", chandrayaan3.getDirection());

        // Turn down
        chandrayaan3.executeCommands(new char[]{'d'});
        assertEquals("Down", chandrayaan3.getDirection());
    }

    @Test
    public void testMixedCommands() {
        Chandrayaan3 chandrayaan3 = new Chandrayaan3();

        // Move forward, turn right, move backward, turn left, and turn up
        chandrayaan3.executeCommands(new char[]{'f', 'r', 'b', 'l', 'u'});
        assertEquals(0, chandrayaan3.getX());
        assertEquals(0, chandrayaan3.getY());
        assertEquals(0, chandrayaan3.getZ());
        assertEquals("Up", chandrayaan3.getDirection());
    }
}
