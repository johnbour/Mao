package code.card;

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
     private ArrayList<Card> deck;
     public Deck() 
     {
            deck=new ArrayList<Card>() ;
            deck.add(new Card("A","Clubs"));
            deck.add(new Card("2","Clubs"));
            deck.add(new Card("3","Clubs"));
            deck.add(new Card("4","Clubs"));
            deck.add(new Card("5","Clubs"));
            deck.add(new Card("6","Clubs"));
            deck.add(new Card("7","Clubs"));
            deck.add(new Card("8","Clubs"));
            deck.add(new Card("9","Clubs"));
            deck.add(new Card("10","Clubs"));
            deck.add(new Card("Jack","Clubs"));
            deck.add(new Card("Queen","Clubs"));
            deck.add(new Card("King","Clubs"));
            deck.add(new Card("A","Diamonds"));
            deck.add(new Card("2","Diamonds"));
            deck.add(new Card("3","Diamonds"));
            deck.add(new Card("4","Diamonds"));
            deck.add(new Card("5","Diamonds"));
            deck.add(new Card("6","Diamonds"));
            deck.add(new Card("7","Diamonds"));
            deck.add(new Card("8","Diamonds"));
            deck.add(new Card("9","Diamonds"));
            deck.add(new Card("10","Diamonds"));
            deck.add(new Card("Jack","Diamonds"));
            deck.add(new Card("Queen","Diamonds"));
            deck.add(new Card("King","Diamonds"));
            deck.add(new Card("A","Hearts"));
            deck.add(new Card("2","Hearts"));
            deck.add(new Card("3","Hearts"));
            deck.add(new Card("4","Hearts"));
            deck.add(new Card("5","Hearts"));
            deck.add(new Card("6","Hearts"));
            deck.add(new Card("7","Hearts"));
            deck.add(new Card("8","Hearts"));
            deck.add(new Card("9","Hearts"));
            deck.add(new Card("10","Hearts"));
            deck.add(new Card("Jack","Hearts"));
            deck.add(new Card("Queen","Hearts"));
            deck.add(new Card("King","Hearts"));
            deck.add(new Card("A","Spades"));
            deck.add(new Card("2","Spades"));
            deck.add(new Card("3","Spades"));
            deck.add(new Card("4","Spades"));
            deck.add(new Card("5","Spades"));
            deck.add(new Card("6","Spades"));
            deck.add(new Card("7","Spades"));
            deck.add(new Card("8","Spades"));
            deck.add(new Card("9","Spades"));
            deck.add(new Card("10","Spades"));
            deck.add(new Card("Jack","Spades"));
            deck.add(new Card("Queen","Spades"));
            deck.add(new Card("King","Spades"));
            Collections.shuffle(deck);

     }
     public ArrayList<Card> getDeck()
     {
          return deck;
     } 
} 
