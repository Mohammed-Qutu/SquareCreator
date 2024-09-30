/*
Mohammed Qutu
4/1/24 
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
*/

package com.mycompany.squarecreator;

public class SquareCreatorApp {

    public static void main(String[] args) {
        Square square1 = new Square(10);
        Square square2 = new Square(4);

        System.out.println("Square 1: \n" + square1.toString());
        System.out.println("Square 2: \n" + square2.toString());
        System.out.println("Are the areas equal? " + square1.equals(square2));
    }
}
