package com.pluralsight;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class BedtimeStories {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("What story would you like to read? ");
        String userInput = myScanner.nextLine();

        if (userInput.equalsIgnoreCase("Goldilocks")) {
            try {
                BufferedReader buffReader = new BufferedReader(new FileReader("src/main/resources/goldilocks.txt"));

                String currentLine;
                int i = 1;
                while ((currentLine = buffReader.readLine()) != null) {

                    System.out.println(i + ". " + currentLine);
                    i++;
                }
                buffReader.close();

            } catch (Exception e){

                System.out.println("Could not find file.");

            }
        }
        else if (userInput.equalsIgnoreCase("Hansel and Gretel")) {
            try {
                BufferedReader buffReader = new BufferedReader(new FileReader("src/main/resources/hansel_and_gretel.txt"));

                String currentLine;

                int i = 1;
                while ((currentLine = buffReader.readLine()) != null) {

                    System.out.println(i + ". " + currentLine);
                    i++;
                }
                buffReader.close();

            } catch (Exception e){

                System.out.println("Could not find file.");

            }
        }
        else {
            try {
                BufferedReader buffReader = new BufferedReader(new FileReader("src/main/resources/mary_had_a_little_lamb.txt"));

                String currentLine;

                int i = 1;
                while ((currentLine = buffReader.readLine()) != null) {

                    System.out.println(i + ". " + currentLine);
                    i++;
                }
                buffReader.close();

            } catch (Exception e){

                System.out.println("Could not find file.");

            }
        }
    }
}
