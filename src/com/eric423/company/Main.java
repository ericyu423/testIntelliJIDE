package com.eric423.company;
import myPackage.Ball;

public class Main {

    public static void main(String[] args) {

	    Ball ball = new Ball("color","Large");

	    //ball.getColor();
	    //ball.getSize(); //can not do this is access protected

        Soccer soccer = new Soccer("white","small");

       // soccer.getColor();

        soccer.printLine();





    }
}

class Soccer extends Ball {

    public Soccer(String color, String size) {
        super(color, size);
    }

    String temp = this.getSize();
    protected void printLine(){
       // System.out.println(temp);
        System.out.println(this.getSize());
    }
}
