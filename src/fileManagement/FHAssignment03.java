package fileManagement;

import java.io.*;

public class FHAssignment03 {
    public static void main(String[] args) {
//        TODO: BufferedReader and BufferedWriter
        final String root = System.getProperty("user.dir") + "\\src\\fileManagement\\files";

//        Q-1:
//        Write a program that:
//        Writes 5 lines to students.txt using BufferedWriter
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(root+"\\student.txt"));
//            writer.write("This is a file containing student details.");
//            writer.newLine();
//            writer.write("Student name");
//            writer.newLine();
//            writer.write("Student enrollment");
//            writer.newLine();
//            writer.write("Student date of birth");
//            writer.newLine();
//            writer.write("Student course");
//            writer.newLine();
//            writer.close();
//        } catch (IOException e) {
//            System.out.println("Something went wrong!");
//            throw new RuntimeException(e);
//        }

//        Q-2:
//        Write another program that:
//        Reads students.txt line by line
//        Prints each line with line number
//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(root+"\\student.txt"));
//            String line;
//            while ((line=reader.readLine()) != null){
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Something went wrong");
//            throw new RuntimeException(e);
//        }

    }
}
