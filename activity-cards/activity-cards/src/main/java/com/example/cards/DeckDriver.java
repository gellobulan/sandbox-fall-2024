package com.example.cards;

public class DeckDriver {

    public static void main(String[] args) {
         Deck cards = new Deck();
         System.out.println(cards);
         cards.shuffle();
         System.out.println(cards);
    }
}
