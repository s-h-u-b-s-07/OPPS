package com.bridgelabz.opps;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CardGame {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        String[] suit = { "Diamonds", "Spades", "Clubs", "Hearts" };
        String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                String card = suit[i] + rank[j];
                q.add(card);
            }
        }
        Collections.shuffle((List<?>) q);
        for (int i = 0; i < 4; i++) {
            System.out.print("Player" + (i + 1) + ": [ ");
            for (int j = 0; j < 8; j++) {

                System.out.print(q.poll() + ", ");
            }
            System.out.println(q.poll() + " ]");
        }

    }
}
