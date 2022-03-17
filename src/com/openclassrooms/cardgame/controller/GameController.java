package com.openclassrooms.cardgame.controller;

import com.openclassrooms.cardgame.model.Deck;
import com.openclassrooms.cardgame.model.Player;

import java.util.ArrayList;
import java.util.List;

class View {
    public void something() {
     };
    public void setController(GameController gc) {
    };
}
public class GameController {
    enum GameState {
        AddingPlayers, CardsDealt, WinnerRevealed;
    }
        Deck deck;
        List<Player> players;
        Player winner;
        View view;

        GameState gameState;

        public GameController(Deck deck, View view){
            super();
            this.deck = deck;
            this.view = view;
            this.players = new ArrayList<Player>();
            this.gameState = GameState.AddingPlayers;
            view.setController(this);

        }
        public void run() {
            while (gameState == GameState.AddingPlayers) {
                view.something();
                }
            switch (gameState) {
                case CardsDealt:
                    view.something();
                    break;
                case WinnerRevealed:
                    view.something();
                    break;
            }
        public void addPlayer(String playerName) {
        if (gameState == GameState.AddingPlayers) {
            players.add(new Player(playerName));
            view.something();
        }}
        public void startGame() {
                if (gameState != GameState.CardsDealt) {
                    deck.shuffle();
                    for (Player player : players) {
                        player.addCardToHand(deck.removeTopCard());
                        view.something();
                    }
                    gameState = GameState.CardsDealt;

                }
                this.run();
            }
        }
}
