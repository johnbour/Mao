package code.card;

import java.util.ArrayList;
import java.util.Collections;
public class DeckOfDecks
{
     private ArrayList<Card> superDeck;
     public DeckOfDecks(int players) 
     {
           superDeck=new ArrayList<Card>() ;
           for(int i = 0;i<players;i++)
           {
                 superDeck.addAll(new Deck().getDeck());
           } 
           Collections.shuffle(superDeck);
     } 
} 
