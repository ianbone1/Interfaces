import HiFi.CDPlayer.CDPlayer;
import HiFi.MP3.MP3;
import HiFi.Radio.Radio;
import HiFi.RecordPlayer.RecordPlayer;
import HiFi.Stereo.Stereo;
import HiFi.TapeDeck.TapeDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    private RecordPlayer recordPlayer;
    private TapeDeck tapeDeck;
    private Radio radio;
    private CDPlayer cdPlayer;
    private Stereo stereo;
    private MP3 mp3Player;

    @Before
    public void setup(){
        recordPlayer = new RecordPlayer("Dennon", "Revolution3");
        tapeDeck = new TapeDeck("Hitachi","Dual", 2);
        radio = new Radio("Sony", "ClearSound");
        cdPlayer = new CDPlayer("Sharp", "6 Deck", 6);
        stereo = new Stereo("Big Beats", recordPlayer,tapeDeck,radio,cdPlayer);
        mp3Player = new MP3("Sony Walkman","100Meg");
    }

    @Test
    public void mp3CanConnect() {
        assertEquals("Big Beats",mp3Player.connect(stereo));

    }

    @Test
    public void mp3CanPlay() {
        mp3Player.connect(stereo);
        assertEquals("MP3 Player now playing.", mp3Player.play());
    }

    @Test
    public void mp3NotConnected() {
        assertEquals("Not Connected", mp3Player.play());
    }
}
