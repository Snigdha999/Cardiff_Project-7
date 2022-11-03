package com.maps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapEg {

    public static void main(String[] args) {

        Map<Character,Integer> freqs = new TreeMap<Character,Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = scanner.nextLine();

        for (int i = 0; i < word.length(); i++) {
            // Adjusting freqs based on what char this is

           /* if (!freqs.containsKey(word.charAt(i)))
                freqs.put(word.charAt(i), 1);
            else {
                Integer freq = freqs.get(word.charAt(i));
                freqs.put(word.charAt(i), freq + 1);
            }*/

            //or,

            Character letter = word.charAt(i);
            if(freqs.putIfAbsent(letter, 1)!= null) {
                freqs.put(letter, freqs.get(letter) + 1);
            }
        }

        // Printing out freqs for the characters in the map

        //System.out.println(freqs);

        //or,

        for (Map.Entry<Character, Integer> entry : freqs.entrySet()) {
            System.out.println("The frequency for "+ entry.getKey() + " is "+ entry.getValue());
        }
    }
}
