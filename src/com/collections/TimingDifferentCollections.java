package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class TimingDifferentCollections {
    public static void main(String[] args) {

        // Create a new ArrayList to store Integers and calculating the time
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        // ADDING TO END OF ARRAYLIST
        long startTime1 = System.currentTimeMillis();
        long startTimeInNano1 = System.nanoTime();
        for(int i=0; i <= 100000; i++){
            integerArrayList.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        long endTimeInNano1 = System.nanoTime();
        System.out.println("Time for adding elements to end of ArrayList = " + (endTime1-startTime1));
        System.out.println("Time for adding elements to end of ArrayList in nanosec = " + (endTimeInNano1-startTimeInNano1));

        // Clear these so we restart with an empty set of lists
        integerArrayList.clear();

        // ADDING TO START OF ArrayList
        long startTime2 = System.currentTimeMillis();
        long startTimeInNano2 = System.nanoTime();
        for(int i=0; i <= 100000; i++){
            integerArrayList.add(0,i);
        }
        long endTime2 = System.currentTimeMillis();
        long endTimeInNano2 = System.nanoTime();
        System.out.println("Time for adding elements to start of ArrayList = " + (endTime2-startTime2));
        System.out.println("Time for adding elements to start of ArrayList in nanosec = " + (endTimeInNano2-startTimeInNano2));


         // Create a new LinkedList to store Integers and calculating the time
        LinkedList<Integer> integerLinkedList = new LinkedList<Integer>();

        // ADDING TO END OF LINKED List
        long startTime3 = System.currentTimeMillis();
        long startTimeInNano3 = System.nanoTime();
        for(int i=0; i <= 100000; i++){
            integerLinkedList.add(i);
        }
        long endTime3 = System.currentTimeMillis();
        long endTimeInNano3 = System.nanoTime();
        System.out.println("Time for adding elements to end of LinkedList = " + (endTime3-startTime3));
        System.out.println("Time for adding elements to end of LinkedList in nanosec = " + (endTimeInNano3-startTimeInNano3));

        // Clear these so we restart with an empty set of lists
         integerLinkedList.clear();

        // ADDING TO START OF LINKEDLIST
        long startTime4 = System.currentTimeMillis();
        long startTimeInNano4 = System.nanoTime();
        for(int i=0; i <= 100000; i++){
            integerLinkedList.add(0,i);
        }
        long endTime4 = System.currentTimeMillis();
        long endTimeInNano4 = System.nanoTime();
        System.out.println("Time for adding elements to start of LinkedList = " + (endTime4-startTime4));
        System.out.println("Time for adding elements to start of LinkedList in nanosec = " + (endTimeInNano4-startTimeInNano4));


        // Clear these so we restart with an empty set of lists
        integerArrayList.clear();
        integerLinkedList.clear();

    }
}
