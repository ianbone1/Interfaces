package HiFi.TapeDeck;

import HiFi.Component;
import HiFi.IPlay;

public class TapeDeck extends Component implements IPlay {

    private int numDecks;
    private int selectedDeck;

    public TapeDeck(String make, String model, int numDecks) {
        super(make, model);
        if (numDecks >0) {
            this.numDecks = numDecks;
            this.selectedDeck = 1;
        } else {
            this.numDecks = 1;
            this.selectedDeck = 1;
        }
    }

    public void selectDeck(int selectedDeck){
        if ((selectedDeck >0) && (selectedDeck <= this.numDecks)){
            this.selectedDeck=selectedDeck;
        }
    }

    public int getNumDecks() {
        return this.numDecks;
    }

    public int getSelectedDeck() {
        return this.selectedDeck;
    }

    public String play() {
        return "Now playing deck " + this.selectedDeck;
    }
}
