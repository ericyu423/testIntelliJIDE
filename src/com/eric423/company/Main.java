package com.eric423.company;
import myPackage.Ball;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        HashMap<String, String> myDict = new HashMap<>();
        myDict.put("1", "blue");
        myDict.put("2", "green");
        myDict.put("3", "yellow");

        System.out.println(myDict);
        System.out.println(myDict.entrySet());


      //  myDict.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));

        myDict.forEach( (k,v) -> {

                    System.out.println("key" + k);
                    System.out.println("value" + v);
                }
        );

        /*


        for(Map.Entry<String, HashMap> entry : myDict.entrySet()) {
            String key = entry.getKey();
            HashMap value = entry.getValue();

            // do what you have to do here
            // In your case, another loop.
        }*/







        /*




        //Hashmaps (key -> value)
        //dict in swift

        // HashMap<Interger, String> newUsers = new HashMap<Interger, String>();
        // can declare it to be some type

        //HashMap users = new HashMap();

        HashMap<String, Integer> users = new HashMap<String, Integer>();

        users.put("myKey1",23);
        users.put("myKey2",55);
        users.put("x1",55);
        users.put("y2",66);


        Iterator iterator = users.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry keyValuePair = (Map.Entry) iterator.next();
            System.out.println("key: " + keyValuePair.getKey() + " value: " + keyValuePair.getValue());




        }*/


        //System.out.println(users.entrySet());
        //System.out.println(users.get("myKey2"));

        //ArrayLists

/*



        ArrayList animals = new ArrayList();
        animals.add("Pig");
        animals.add("cow");
        animals.add("cow");
        animals.add(1);

        //class interator hold the hashmap
        Iterator iterator = users.entrySet().iterator();

        //if it have a next item
        while (iterator.hasNext()) {
            //cast interator.next() to a Map.entry ...basically translate this to a map.entry that we can use
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println("key value pair have key " + pair.getKey() + " value " + pair.getValue());

        }
       /* for (int i = 0; i < animals.size() ; i++) {
            System.out.println(animals.get(i));
        }*/

        //in swift -  for aniaml in animals {}
       /* for (Object animal : animals) {
           // System.out.println(animal);
        }*/









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
