package com.openclassrooms.cardgame.model;

public class PlayingCard {
    private Rank rank;
    private Suit suit;

    public Boolean isFaceUp() {
        return faceUp;
    }
    public Boolean flip(){
        faceUp = !faceUp;
        return faceUp;
    }

    private Boolean faceUp;

    public PlayingCard(Rank rank, Suit suit) {
        super();
        this.rank = rank;
        this.suit = suit;

    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }




    {

    }

}
