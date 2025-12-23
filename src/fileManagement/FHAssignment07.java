package fileManagement;

import java.io.*;
import java.util.Scanner;

public class FHAssignment07 {
    public static void main(String[] args) throws Exception {

        final String root = System.getProperty("user.dir") + "\\src\\fileManagement\\files";

//      Copy file content from source to destination
//        try (FileInputStream fis = new FileInputStream(root + "\\q1source.txt");
//             FileOutputStream fos = new FileOutputStream(root + "\\q1destination.txt")) {
//            int ch;
//            long st = System.currentTimeMillis();
//            while ((ch = fis.read()) != -1) {
//                fos.write(ch);
//            }
//            long en = System.currentTimeMillis();
//            System.out.println("File copied successfully:)");
//            System.out.println("Time taken by FileIOStream to copying the file: " + (en - st));
//        } catch (Exception e) {
//            System.out.println("Something went wrong!");
//        }

//        Logs generator: appends the logs
//        try (FileOutputStream fos = new FileOutputStream(root + "\\logs.txt", true)) {
//            Scanner sc = new Scanner(System.in);
//            String str = sc.nextLine()+"\n";
//            fos.write(str.getBytes());
//            System.out.println("Logs added");
//        }

//        Large File Reading
//        Using FileInputStream
//        try (FileInputStream fos = new FileInputStream(root + "\\largeFile.txt")) {
//            long st = System.currentTimeMillis();
//            int ch;
//            while ((ch = fos.read()) != -1) {
////                System.out.print((char) ch);
//            }
//            long en = System.currentTimeMillis();
//            System.out.println("Time taken by FileInputStream: " + (en - st));
//        }
////        Using BufferedInputStream
//        try (BufferedInputStream fos = new BufferedInputStream(new FileInputStream(root + "\\largeFile.txt"))) {
//            long st = System.currentTimeMillis();
//            int ch;
//            while ((ch = fos.read()) != -1) {
////                System.out.print((char) ch);
//            }
//            long en = System.currentTimeMillis();
//            System.out.println("Time taken by BufferedInputStream: " + (en - st));
//        }

//        Copy file using BufferedIOStream
//        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(root + "\\largeFile.txt"));
//             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(root + "\\largeFileDestination.txt"))) {
//            int ch;
//            long st = System.currentTimeMillis();
//            while ((ch = bis.read()) != -1) {
//                bos.write(ch);
//            }
//            long en = System.currentTimeMillis();
//            System.out.println("Time taken by BufferedIOStream for copying file: " + (en - st));
//
//        }


//        Store and Retrive input data using ByteArrayIOStream
//        Scanner sc = new Scanner(System.in);
//        String data = sc.nextLine();
//        byte[] bytes = data.getBytes();
//        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
//             ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
//             FileOutputStream fos = new FileOutputStream(root+"\\dataOfByteArrayIOStream.txt")) {
//            baos.write(data.getBytes());
//            System.out.println(baos);
//            int ch;
//            while ((ch = bais.read()) != -1) {
//                fos.write(ch);
//                System.out.print((char) ch);
//            }
//        }


    }
}
