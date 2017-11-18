package com.eric423.company;
import myPackage.Ball;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        //ArrayLists


        ArrayList animals = new ArrayList();
        animals.add("Pig");
        animals.add("cow");
        animals.add(1);

       /* for (int i = 0; i < animals.size() ; i++) {
            System.out.println(animals.get(i));
        }*/

        //in swift -  for aniaml in animals {}
        for (Object animal : animals) {
            System.out.println(animal);
        }









        /*

        int[] numberArray = {5,4,2,5,6,7};

        int[] newIntArray = new int[5];  //create an array of 5 element 0-4
        String [] newStringArray = new String[5];

        for (int i=0 ; i < numberArray.length; i++){

            System.out.println(numberArray[i]);
        }


        newIntArray[0] = 1;
        newIntArray[1] = 2;
        newIntArray[2] = 4;



        for (int i=0 ; i < newIntArray.length; i++){

            System.out.println(newIntArray[i]);
        }







	    Ball ball = new Ball("color","Large");

	    //ball.getColor();
	    //ball.getSize(); //can not do this is access protected

        Soccer soccer = new Soccer("white","small");

       // soccer.getColor();

        soccer.printLine();


      */


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
