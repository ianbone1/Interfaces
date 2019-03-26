import HiFi.Radio.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void setup(){
        radio = new Radio("Yamaha", "2000R");
    }

    @Test
    public void canTune() {
        assertEquals("Radio Clyde 1 now tuned and playing.", radio.tune("Radio Clyde 1"));
    }
}
