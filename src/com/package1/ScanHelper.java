package com.package1;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanHelper {

    public void scanAndPrint(String filename) {
        Scanner s = null;
        double sum = 0;

        try {
            s = new Scanner(new BufferedReader(new FileReader(filename)));

            while (s.hasNext()) {
                if (s.hasNextDouble()) {
                    sum += s.nextDouble();
                } else {
                    s.next();
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
