package Challenges.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileProcessor {
    public void processFile(String filePath) {

        try (FileReader reader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found at " + filePath + ". " + e.getMessage());

        } catch (IOException e) {

            System.err.println("Error reading file: " + e.getMessage());

        }

    }

    public static void main(String[] args) {
        FileProcessor processor = new FileProcessor();


        System.out.println("--- Attempting to process existing file (e.g., test.txt) ---");
        processor.processFile("test.txt");


        System.out.println("\n--- Attempting to process non-existent file ---");
        processor.processFile("nonExistentFile.txt");


        System.out.println("\n--- Attempting to process a file that might cause an IOException (less common simulation) ---");

        processor.processFile("anotherFile.txt");
    }
}