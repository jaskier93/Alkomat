package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Alcohol> alcohol = new ArrayList<>();

        alcohol.add(new Alcohol("Beer", 0.05f));
        alcohol.add(new Alcohol("Champagne", 0.09f));
        alcohol.add(new Alcohol("Vodka", 0.38f));
        alcohol.add(new Alcohol("Wine", 0.15f));
        alcohol.add(new Alcohol("Whiskey", 0.4f));

        for (int i = 0; i < alcohol.size(); i++) {
            System.out.println(alcohol.get(i).calculatePerMil(500, 80, true));
        }
        System.out.println("\n");
        for (int i = 0; i < alcohol.size(); i++) {
            System.out.println(alcohol.get(i).calculatePerMil(500, 60, false));
        }


    }
}
