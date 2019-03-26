import HiFi.RecordPlayer.RecordPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordPlayerTest {

    private RecordPlayer recordPlayer;

    @Before
    public void setup(){
        recordPlayer = new RecordPlayer("Denon", "Revolution3");
    }

    @Test
    public void canSetSpeed() {
        recordPlayer.setSpeed(45);
        assertEquals(45, recordPlayer.getSpeed());
    }

    @Test
    public void testCanPlay45() {
        recordPlayer.setSpeed(45);
        assertEquals("Now Playing at 45", recordPlayer.play());
    }
}
