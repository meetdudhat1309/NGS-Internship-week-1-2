package fileManagement;

import java.io.File;
import java.io.IOException;

public class FHAssignment01 {
    public static void main(String[] args) {
//        Q-1:
//        Write a Java program that:
//        Creates a file named data.txt Prints whether the file exists or not
        File file1 = new File("data.txt");
        System.out.println(file1.exists());

//        Q-2:
//        Modify your program to:
//        Print the absolute path of the file
        File file2 = new File("demo.txt");
        System.out.println(file2.getAbsolutePath());

//        Q-3:
//        Write a program that prints:
//        The current working directory
//        The absolute path of a file named notes.txt
        System.out.println(System.getProperty("user.dir"));
        File file3 = new File("notes.txt");
        System.out.println(file3.getAbsolutePath());

//        Q-4:
//        Create a file inside a folder
        File myFiles = new File("myfiles");
        if (!myFiles.exists()) {
            myFiles.mkdir();
        }
        File file4 = new File("myfiles\\info.txt");
        try {
            if ( file4.createNewFile()){
                System.out.println("File created successfully");
            }else {
                System.out.println("Something went wrong!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Q-5:
//        Write a program that:
//        Checks if report.txt exists
//        If yes → print its size
//        If no → print "File not found"
        File reportFile = new File("report.txt");
        if (reportFile.exists()){
            System.out.println("Size: "+reportFile.length());
        }else {
            System.out.println("File not found");
        }

//        Q-6:
//        Create a folder named temp manually.
//        Then write a program to:
//        Check whether temp is a directory or file
        File tempFolder = new File("temp");
        System.out.println("temp is file: "+tempFolder.isFile());
        System.out.println("temp is folder: "+tempFolder.isDirectory());



    }
}
