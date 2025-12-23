package fileManagement;

import java.io.*;
import java.util.Arrays;

public class FHAssignment02 {
    public static void main(String[] args) {
//        TODO: FileReader and FileWriter
        final String root = System.getProperty("user.dir") + "\\src\\fileManagement\\files";
//        Q-1:
//        Write a program that:
//        Creates notes.txt
//        Writes 3 lines of text into it
        try {
            FileWriter writer = new FileWriter(root + "\\notes.txt");
            FileWriter writer2 = new FileWriter(root+"\\notes.txt");
            writer.write("This is a Note file.\n");
            writer.write("Here you can add notes.\n");
            writer.write("You can also edit and delete it.\n");
            writer2.write("Wait wait wait");
            writer.close();
            writer2.close(); // the last closed writer override the output
            System.out.println("File is created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Q-2:
//        Modify the program to:
//        Append a 4th line without deleting previous content
        try {
            FileWriter writer = new FileWriter(root+"\\notes.txt", true);
            writer.write("This is the END!");
            writer.close();
            System.out.println("Content appended!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader reader = new FileReader(root+"\\notes.txt");
            int noOfChar = 0;
//            FileReader reader = new FileReader(root+"\\missing.txt"); //throws an exception FileNotFoundExcepiton
            int ch;
            while ((ch=reader.read()) != -1){
                System.out.print((char) ch);
                noOfChar++;
            }
            System.out.println();
            System.out.println("Number of character in the file: "+ noOfChar);
            reader.close();
        } catch (IOException e) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(e);
        }
    }
}
