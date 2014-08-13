package com.crome.CardGame2;

public class Card
{
  private int suitValue,rankValue;
  
  private String ranks[] = {"Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
  private String suits[] = {"Hearts", "Clubs", "Spades", "Diamonds"};
  
  public Card(int rank, int suit)
  {
    rankValue = rank;
    suitValue = suit;
  }

  public void setRank(int rank){
    rankValue = rank;
  }

  public void setSuit(int suit){
    suitValue = suit;
  }

  public int getRank(){
    return rankValue;
  }

  public int getSuit(){
    return suitValue;
  }
  
}
