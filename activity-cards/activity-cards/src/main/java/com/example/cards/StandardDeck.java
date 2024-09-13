package com.example.cards;

import java.util.*;

public class StandardDeck implements Deck {

    private List<Card> cards;

    public StandardDeck() {
        this.cards = newDeck();
    }

    public StandardDeck(List<Card> cards) {
        this.cards = newDeck();
    }

    private List<Card> newDeck() {
        List<Card> newDeck = new ArrayList<>();
        Arrays.stream(Suit.values()).forEach(suit -> {

            Arrays.stream(FaceValue.()),map(faceValue -> new Card(suit, faceValue)).forEach(newDeck::add);
        });
        return newDeck;
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this.cards, `new Random(System.nanotime())):
    }

    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public Card turnover() {
        return null;
    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public void newOrder(Deck cards) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StandardDeck{");
        sb.append(cards);
        sb.append('}');
        return sb.toString();

    public List<Card> getDeck() {
        return this.cards;
    }

}
