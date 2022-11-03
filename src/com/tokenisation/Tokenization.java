package com.tokenisation;

import java.io.*;
import java.util.Scanner;

public class Tokenization {

    public static void main(String[] args) {
        Scanner s = null;

        try {
            File myText = new File("C:\\Users\\c22073892\\OneDrive - Cardiff University\\Documents\\1st Sem\\CMT653 Programming Principles and Practice\\Week3\\Input Output\\WordsWithSpaces.txt");
            FileWriter writer = new FileWriter("C:\\Users\\c22073892\\OneDrive - Cardiff University\\Documents\\1st Sem\\CMT653 Programming Principles and Practice\\Week3\\Input Output\\WordsWithSpacesOutput.txt");
            PrintWriter printer = new PrintWriter(new BufferedWriter(writer));
            s = new Scanner(myText);

            while (s.hasNext()) {
                String line = s.nextLine();
                String[] words = line.split(" ");
                for (String word : words) {
                    printer.print(word + "\t");
                }
                printer.println();
            }
            s.close();
            printer.close();
            writer.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
