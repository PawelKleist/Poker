package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cards {

    private int r, s;

    private static String[] ranks = {"clubs","diamonds","hearts","spades"};
    private static String[] suits = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    public Cards(int a, int b) {
        this.r = a;
        this.s = b;
    }

    @Override
    public String toString() {
        return "[ " + suits[s] + " of " + ranks[r] + " ]";
    }

}
