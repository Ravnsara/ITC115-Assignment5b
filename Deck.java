package com.crome.CardGame2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



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

  public void shuffle(){
    Collections.shuffle(cards);
  }

  public ArrayList<Card> deal(){
	hand = new ArrayList<Card>();
    for(int i = 1; i <=5; i++){
   
    hand.add(cards.get(i));
    }
	return hand;
    
  }
}