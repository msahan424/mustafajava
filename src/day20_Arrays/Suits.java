package day20_Arrays;

public class Suits {
    public static void main(String[] args) {
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};

        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        //int i = (int) (Math.random() * RANKS.length);
        //int j = (int) (Math.random() * SUITS.length);
        //System.out.println(RANKS[i] + " of " + SUITS[j]);
        String[] deck = new String[RANKS.length * SUITS.length];
        int i;
        int j = 0;
        for (i = 0; i < RANKS.length; i++)
            for (j = 0; j < SUITS.length; j++)
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
        System.out.println(RANKS[i] + " of " + SUITS[j]);
    }
}
