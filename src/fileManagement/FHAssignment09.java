package fileManagement;

import java.io.*;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class FHAssignment09 {
    //  TODO: Mini File Manager System
    public static void main(String[] args) throws Exception {

        StringBuilder root = new StringBuilder(System.getProperty("user.dir")).append("\\src\\fileManagement");
        System.out.println("****************************************************************************************");
        System.out.println("Your Location: " + root);
        System.out.println("****************************************************************************************");

        Scanner sc = new Scanner(System.in);

        int cnt = 1;
        while (cnt != 0) {
            File file = new File(root.toString());

            System.out.println("\n*****Choose operation:***********************************************");
            System.out.println("1.List all files and directories");
            System.out.println("2.Get current location");
            System.out.println("3.Create File");
            System.out.println("4.Delete File");
            System.out.println("5.Move File");
            System.out.println("6.Copy File");
            System.out.println("0.Exit");
            System.out.println("****************************************************************");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    for (File s : Objects.requireNonNull(file.listFiles())) {
                        if (s.isDirectory()) System.out.println("dire- " + s.getName());
                        else System.out.println("file- " + s.getName());
                    }
                    break;
                }
                case 2: {
                    System.out.println(root);
                    break;
                }
                case 3: {
                    System.out.print("Enter File Name(with extension): ");
                    String name = sc.next();
                    System.out.print("Enter File or Directory Path: ");
                    String path = sc.next();
                    createFile(name, path);
                    break;
                }
                case 4: {
                    File[] list = Objects.requireNonNull(file.listFiles());
                    for (int i = 0; i < list.length; i++) {
                        System.out.println((i + 1) + "." + list[i].getName());
                    }
                    System.out.print("Select file number: ");
                    int c = sc.nextInt();
                    String name = list[c - 1].getAbsolutePath();
                    deleteFile(name);
                    System.out.println(root);
                    break;
                }
                case 5: {//Move file
                    System.out.println(root);
                    break;
                }
                case 6: {//Copy file
                    File[] list = Objects.requireNonNull(file.listFiles());
                    for (int i = 0; i < list.length; i++) {
                        System.out.println((i + 1) + "." + list[i].getName());
                    }
                    System.out.print("Select file number: ");
                    int c = sc.nextInt();
                    String srcPath = list[c - 1].getAbsolutePath();
                    System.out.print("Enter destination path: ");
                    String destPath = sc.next();
                    copyFile(srcPath, destPath);
                    System.out.println(root);
                    break;
                }
                case 0: {
                    cnt = 0;
                    break;
                }
                default: {
                    break;
                }
            }
        }

    }

    private static void createFile(String fileName, String path) {
        File dir = new File(path);
        if (!dir.exists()) dir.mkdir();
        if (!dir.exists()) dir.mkdirs();
        File file = new File(path + "\\" + fileName);
        if (file.exists()) {
            System.out.println("File already exist!");
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File created:)");
                } else {
                    System.out.println("File does not created!");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void deleteFile(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted:)");
            } else {
                System.out.println("File does not deleted:)");
            }
        }
    }

    private static void copyFile(String srcPath, String destPath) {

        File srcFile = new File(srcPath);
        File destFile = new File(destPath);
//        if (!destFile.exists()) destFile.mkdir();
//        if (!destFile.exists()) destFile.mkdirs();
        if (srcFile.exists()) {
            try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcPath));
                 BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {
                int ch;
                while ((ch = bis.read()) != -1) {
                    bos.write(ch);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Source doesn't exist!");
        }
    }

}
