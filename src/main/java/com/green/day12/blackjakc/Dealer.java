package com.green.day12.blackjakc;

public class Dealer extends Gamer {
    public void needMoreCard(CardDeck card){
        //본인이 16점 이하면 카드 한장 더 받는다.
        if(point <= 16){
            receiveCard(card.draw());
        }
    }
}
