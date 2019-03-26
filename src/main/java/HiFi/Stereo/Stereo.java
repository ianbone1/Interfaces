package HiFi.Stereo;

import HiFi.CDPlayer.CDPlayer;
import HiFi.Radio.Radio;
import HiFi.RecordPlayer.RecordPlayer;
import HiFi.TapeDeck.TapeDeck;

public class Stereo {

    private String name;
    private RecordPlayer recordPlayer;
    private TapeDeck tapeDeck;
    private Radio radio;
    private CDPlayer cdPlayer;

    public Stereo(String name, RecordPlayer recordPlayer, TapeDeck tapeDeck, Radio radio, CDPlayer cdPlayer) {
        this.name = name;
        this.recordPlayer = recordPlayer;
        this.tapeDeck = tapeDeck;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
    }

    public String playCD(){
        return cdPlayer.play();
    }

    public String playTape(){
        return tapeDeck.play();
    }

    public String playRecord(){
        return recordPlayer.play();
    }

    public String tuneRadio(String station){
        return radio.tune(station);
    }

    public String getName() {
        return this.name;
    }
}
