import HiFi.CDPlayer.CDPlayer;
import HiFi.Radio.Radio;
import HiFi.RecordPlayer.RecordPlayer;
import HiFi.Stereo.Stereo;
import HiFi.TapeDeck.TapeDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {
    private RecordPlayer recordPlayer;
    private TapeDeck tapeDeck;
    private Radio radio;
    private CDPlayer cdPlayer;
    private Stereo stereo;

    @Before
    public void setup(){
        recordPlayer = new RecordPlayer("Dennon", "Revolution3");
        tapeDeck = new TapeDeck("Hitachi","Dual", 2);
        radio = new Radio("Sony", "ClearSound");
        cdPlayer = new CDPlayer("Sharp", "6 Deck", 6);
        stereo = new Stereo("Big Beats", recordPlayer,tapeDeck,radio,cdPlayer);
    }

    @Test
    public void canPlayRecord() {
        assertEquals("Now Playing at 33", recordPlayer.play());
    }

    @Test
    public void canPlayTape() {
        assertEquals("Now playing deck 1", tapeDeck.play());
    }

    @Test
    public void canTuneRadio() {
        assertEquals("Alba now tuned and playing.", radio.tune("Alba"));
    }

    @Test
    public void canPlayCD() {
        assertEquals("Now Playing", cdPlayer.play());
    }

}
