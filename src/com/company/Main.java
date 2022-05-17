package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape=new Kvadrat();
        System.out.println(shape.getPerimetr());

        Shape shape1=new Triugolnik();
        System.out.println( shape1.getPerimetr());

        Shape shape2=new Pryamougplnik();
        System.out.println(shape2.getPerimetr());




    }

}
