/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Random random = new Random();
        Card[] magicHand = new Card[7];
        
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            
            int randomValue = random.nextInt(13) + 1; 
            c.setValue(randomValue);
            
            int randomSuitIndex = random.nextInt(4);
            c.setSuit(Card.SUITS[randomSuitIndex]);
            
            magicHand[i] = c;
            
            System.out.println("Card " + (i + 1) + ": " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }
        
        
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number between 1-13");
        int input = s.nextInt();
        
        System.out.println("Enter a suit:");
        String suit = s.next();
        
        Card c1 = new Card();
        c1.setValue(input);
        c1.setSuit(suit);
        
        int count = 0;
        for (int i=0; i<magicHand.length; i++) {
            if (magicHand[i].getValue() == c1.getValue() && magicHand[i].getSuit().equalsIgnoreCase(c1)) {
                count += 1;
            }
        }
        
        if(count == 1){
            System.out.println("Match");
        }else{
            System.out.println("No Match");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
        //lucky card 
        
    }   
}
