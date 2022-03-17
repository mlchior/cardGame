package com.openclassrooms.cardgame.model;

import java.util.*;

public class Deck {
    public List<PlayingCard> getCards() {
        return cards;
    }

    private List<PlayingCard> cards;

    public Deck() {
        cards = new ArrayList<PlayingCard>();
        for(Rank rank : Rank.values()) {
            for(Suit suit: Suit.values()){
                System.out.println("Creation card ["+rank+"]["+suit+"])");
                cards.add(new PlayingCard(rank, suit));

            }
        }
        Shuffle();
    }

    private void Shuffle() {
        Random random = new Random();
        for (int i =0; i < cards.size();++i){
            Collections.swap(cards,i,random.nextInt (cards.size()));
        }
    }
    public PlayingCard removeTopCard() {

        return cards.remove(0);
    }
    public void returnCardToDeck(PlayingCard pc){
        cards.add(pc);
    }

}
