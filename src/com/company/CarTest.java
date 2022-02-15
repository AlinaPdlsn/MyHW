package com.company;

public class CarTest {

    public static void main(String[] args) {

        Car aveo = new Car();

        aveo.carBrand = "Aveo";

        aveo.color = "metalic";

        aveo.year = 10;

        System.out.println(aveo.getCarBrand());

        System.out.println(aveo.getColor());

        System.out.println(aveo.getYear());
    }

}
