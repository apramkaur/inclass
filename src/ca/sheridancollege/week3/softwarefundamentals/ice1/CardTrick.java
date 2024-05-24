package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack = 11, Queen = 12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Apram
 * @modifier Apram
 */

public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        for (int i = 0; i < magicHand.length; i++) {
            System.out.println("Card " + (i + 1) + ": " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }

    
        Card luckyCard = new Card();
        luckyCard.setValue(7);
        luckyCard.setSuit("Hearts");
        System.out.println("Lucky Card: " + luckyCard.getValue() + " of " + luckyCard.getSuit());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter card value (1 to 13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter card suit (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.nextLine();

        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userValue && card.getSuit().equalsIgnoreCase(userSuit)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }
}
