import java.util.ArrayList;
import java.util.Arrays;

public abstract class CardManager {

    private ArrayList<Card> cards;

    public CardManager(){
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    @Override
    public String toString() {
        return Arrays.toString(cards.toArray()); //cards -> Arrays -> with toString() from Card class to -> String
    }
}
