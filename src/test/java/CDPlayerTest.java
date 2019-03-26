import HiFi.CDPlayer.CDPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    private CDPlayer cdPlayer;

    @Before
    public void setup(){
        cdPlayer = new CDPlayer("Dennon", "Super Six", 6);
    }

    @Test
    public void testHasCDs() {
        assertEquals(6, cdPlayer.getNumCDs());
    }

    @Test
    public void testCanPlay() {
        assertEquals("Now Playing", cdPlayer.play());
    }
}
