package com.company;

public class CountryTest {

    public static void main(String[] args) {

        Country ukraine = new Country();

        ukraine.name = "Ukraine";

        ukraine.population = 45;

        ukraine.territory = 603548;

        System.out.println(ukraine.getName());

        System.out.println(ukraine.getPopulation());

        System.out.println(ukraine.getTerritory());

    }
}
