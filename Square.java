/*
Mohammed Qutu
4/1/24
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
*/

package com.mycompany.squarecreator;

public class Square {

    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public int calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Side length: " + sideLength + "\nArea: " + calculateArea();
    }

    public boolean equals(Square otherSquare) {
        return this.calculateArea() == otherSquare.calculateArea();
    }
}
