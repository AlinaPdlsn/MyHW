package com.company;

public class IdentityCardTest {

    public static void main(String[] args) {

        IdentityCard ivanna = new IdentityCard();

        ivanna.name = "Ivanna";

        ivanna.surname = "Yariga";

        ivanna.number = 1320895;

        System.out.println(ivanna.getName());

        System.out.println(ivanna.getSurname());

        System.out.println(ivanna.getNumber());

    }

}
