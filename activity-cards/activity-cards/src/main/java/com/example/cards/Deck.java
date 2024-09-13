package com.example.cards;

public class Deck {

    void shuffle();
    void cut(int index);
    Card deal();
    Card turnover();
    int search(Card card);
    void newOrder(Deck cards);
    int size();

}
