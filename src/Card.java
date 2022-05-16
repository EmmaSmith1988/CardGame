
import java.util.HashMap;

public class Card {
    public String[] suits = {"\u2660", "\u2661", "\u2662", "\u2663"};
    public String[] symbols = {"2", "3", "4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
    public int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13, 14};

    public String toCardString(String symbol, String suit) {
        return symbol + " of " + suit + "'s";
    }
    public HashMap<String, String> createHashMapCard(String suit, String symbol, String value) {
        HashMap<String, String> hashMapCard = new HashMap<>();
        hashMapCard.put("Suit", suit);
        hashMapCard.put("Symbol", symbol);
        hashMapCard.put("Value", value);
        return hashMapCard;
    }
}
