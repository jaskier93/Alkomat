package com.company;

import java.text.DecimalFormat;

public class Alcohol {

    private String name;
    private float alkoPower;

    public static final float THE_DENSITY_RATIO_OF_ETHYL_ALCOHOL = 0.789f;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAlkoPower() {
        return alkoPower;
    }

    public void setAlkoPower(float alkoPower) {
        this.alkoPower = alkoPower;
    }

    public Alcohol(String name, float alkoPower) {
        this.name = name;
        this.alkoPower = alkoPower;
    }

    float calculatePerMil(int quantity, int weight, boolean male) {

        //promile=ilosc wypitego alko/(wsp. 0,7 facet, 0.6 kobieta *masa)
        DecimalFormat df = new DecimalFormat("#.##");

        float genderRate;

        String gender = "";

        if (male) {
            gender = "Man";
            genderRate = 0.7f;
        } else {
            genderRate = 0.6f;
            gender = "Woman";
        }

        float power = (float) (quantity * alkoPower * THE_DENSITY_RATIO_OF_ETHYL_ALCOHOL) / (weight * genderRate);

        System.out.println("" + gender + " (" + weight + " kg) will have " + (df.format(power + 0.01f)
                + "‰ blood-alcohol content after drinking " + quantity + " of " + getName()));

        return power;

    }
}