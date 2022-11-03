package com.inputoutput;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

public class WriterTest {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("out.txt");
            PrintWriter print = new PrintWriter(new BufferedWriter(writer));

            print.println("Hello, world!");
            print.println("My name is Louise");

            print.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
