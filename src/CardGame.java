import java.util.*;


public class CardGame {
    Card card = new Card();
    ArrayList<HashMap> deck = new ArrayList<>();

    public CardGame() {

        for (int i = 0; i < card.suits.length; i++) {
            for (int j = 0; j < card.symbols.length; j++) {
                deck.add(card.createHashMapCard(card.suits[i], card.symbols[j], String.valueOf(card.values[j])));
            }
        }
    }
    public void getDeck() {
        for (int i = 0; i < deck.size(); i++) {
            System.out.println(card.toCardString((String) deck.get(i).get("Symbol"), (String) deck.get(i).get("Suit")));
        }
    }

    public String dealCard() {
        return card.toCardString((String) deck.get(0).get("Symbol"), (String) deck.get(0).get("Suit"));
    }


//    public void sortDeckInNumberOrder() {
//        Collections.sort(deck, new Comparator<HashMap<String, String>>() {
//            @Override
//            public int compare(final HashMap<String, String> o1, final HashMap<String, String> o2) {
//                // Do your sorting...
//                return Integer.valueOf(o1.get("Value"))
//                        .compareTo(Integer.valueOf(o2.get("Value")));
//            }
//        });
//        System.out.println(deck);
//    }

    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        cardGame.getDeck();
        System.out.println(cardGame.dealCard());
//        cardGame.sortDeckInNumberOrder();

    }
}

