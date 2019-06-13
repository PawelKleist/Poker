package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private ArrayList<Cards> deck = new ArrayList<Cards>();
    private ArrayList<Cards> handPlayer = new ArrayList<Cards>();
    private ArrayList<Cards> handComputer = new ArrayList<Cards>();


    public ArrayList<Cards> getHandPlayer() {
        return handPlayer;
    }

    public ArrayList<Cards> getHandComputer() {
        return handComputer;
    }

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
            handPlayer.add(deck.get(index1));
            deck.remove(index1);
            System.out.println(handPlayer.get(i-1));
        }

        System.out.println("\nComputer's hand: \n");
        for(int k=1;k<=5;k++) {
            index2 = 1+ generator.nextInt(deck.size()-1);
            handComputer.add(deck.get(index2));
            deck.remove(index2);
            System.out.println(handComputer.get(k-1));

        }

        //public void check(ArrayList<Cards> setCard) {

        //}

        /*System.out.println("Rest of the deck: ");

        for(int j=0;j<=deck.size()-1;j++) {
            System.out.println(deck.get(j));
        }
        */



    }




}
