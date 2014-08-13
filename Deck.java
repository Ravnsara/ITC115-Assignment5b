package com.crome.CardGame2;
/*
 * creates the card deck
 * and shuffles the cards
 */

import java.util.ArrayList;
import java.util.Collections;

//create deck and then shuffle
public class Deck{
	
  private ArrayList<Card> cards;
  private ArrayList<Card> hand;
  
  public Deck()
  {
	  cards = new ArrayList<Card>();
	  for(int a = 1; a <= 4; a++)
    {
      for(int b = 1; b <= 13; b++)
      {
        cards.add(new Card(a,b));
      }
    }
    shuffle();
  }
  //shuffle deck
  public void shuffle(){
    Collections.shuffle(cards);
  }
  //deal 5 cards
  public ArrayList<Card> deal(){
	hand = new ArrayList<Card>();
    for(int i = 1; i <=5; i++){
   
    hand.add(cards.get(i));
    }
	return hand;
    
  }
}