import java.util.zip.DataFormatException;

public class Game {

    public static void main(String args[]) {
        Hand hand = new Hand();
        Deck deck = new Deck();
        Board board = new Board();

        //cards
        Card ivan = new Card(1, 2, "Ivan");
        //Card leeroy = new Card(10, 12, "Leeroy");

        deck.addCard(ivan);
        System.out.println("Karten im Deck:" + deck.toString());
        System.out.println("Karten in der Hand:" + hand.toString());
        System.out.println("Karten auf dem Board:" + board.toString());


        deck.removeCard(new Card(1, 2, "Ivan"));
        System.out.println("Karten im Deck:" + deck.toString());
        System.out.println("Karten in der Hand:" + hand.toString());
        System.out.println("Karten auf dem Board:" + board.toString());

        hand.addCard(new Card(1, 2, "Ivan"));
        System.out.println("Karten im Deck:" + deck.toString());
        System.out.println("Karten in der Hand:" + hand.toString());
        System.out.println("Karten auf dem Board:" + board.toString());


            hand.removeCard(new Card(1, 2, "Ivan"));
            System.out.println("Karten im Deck:" + deck.toString());
            System.out.println("Karten in der Hand:" + hand.toString());
            System.out.println("Karten auf dem Board:" + board.toString());

            board.addCard(new Card(1, 2, "Ivan"));
            System.out.println("Karten im Deck:" + deck.toString());
            System.out.println("Karten in der Hand:" + hand.toString());
            System.out.println("Karten auf dem Board:" + board.toString());
    }

}
