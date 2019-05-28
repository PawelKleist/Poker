package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Cards> deck = new ArrayList<Cards>();
    private ArrayList<Cards> hand = new ArrayList<Cards>();

    public Deck() {
        Random generator = new Random();
        int index1, index2;

        for(int a = 0; a<=3; a++) {
            for(int b = 0; b<=12; b++) {
                deck.add(new Cards(a,b));
            }
        }

        System.out.println("Your hand: ");

        for(int i=1;i<=5;i++) {
            index1 = 1+ generator.nextInt(deck.size()-1);
            hand.add(deck.get(index1));
            deck.remove(index1);
            System.out.println(hand.get(i-1));
        }

        System.out.println("Rest of the deck: ");

        for(int j=0;j<=46;j++) {
            System.out.println(deck.get(j));
        }


    }




}
