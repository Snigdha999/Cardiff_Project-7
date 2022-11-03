// adapted from https://docs.oracle.com/javase/tutorial/essential/io/scanning.html
package com.inputoutput;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanSum {

    public static void main(String[] args) {

        Scanner s = null;
        double sum = 0;

            try {
                s = new Scanner(new BufferedReader(new FileReader("C:\\Users\\c22073892\\IdeaProjects\\test-1\\src\\com\\inputoutput\\numbers.txt")));
                if(s != null) {
                    while (s.hasNext()) {
                        if (s.hasNextDouble()) {
                            sum += s.nextDouble();
                        } else {
                            s.next();
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            } finally {
                s.close();
            }
            System.out.println(sum);
        }
}