import HiFi.TapeDeck.TapeDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TapeDeckTest {

    TapeDeck tapeDeck;

    @Before
    public void setup(){
        tapeDeck = new TapeDeck("Hitachi", "Dual", 2);
    }

    @Test
    public void testHas2decks() {
        assertEquals(2, tapeDeck.getNumDecks());
    }

    @Test
    public void canSelectDeck2() {
        tapeDeck.selectDeck(2);
        assertEquals(2, tapeDeck.getSelectedDeck());
    }

    @Test
    public void testGetName() {
        assertEquals("Hitachi", tapeDeck.getMake());
        assertEquals("Dual", tapeDeck.getModel());
    }

    @Test
    public void testCanPlayDeck2() {
        tapeDeck.selectDeck(2);
        assertEquals("Now playing deck 2", tapeDeck.play());
    }
}
