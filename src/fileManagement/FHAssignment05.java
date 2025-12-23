package fileManagement;

import java.io.*;

public class FHAssignment05 {
    public static void main(String[] args) throws Exception {
        final String root = System.getProperty("user.dir") + "\\src\\fileManagement\\files";
//        TODO: InputStream
//        1. Read a file using FileInputStream
//        try (FileInputStream fis = new FileInputStream(root + "\\fisDemo.txt")) {
//            int ch;
//            while ((ch = fis.read()) !=-1){
//                System.out.print((char) ch);
//            }
//        }

//        2. Convert a string to bytes and read it using ByteArrayInputStream
//        String text = "This text is for ByteArrayInputStream";
//        byte[] bytes = text.getBytes();
//        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
//        int ch;
//        while ((ch=bais.read()) != -1){
//            System.out.print((char) ch);
//        }

//        3. Compare execution time of FileInputStream vs BufferedInputStream
//        try (FileInputStream fis = new FileInputStream(root + "\\performance.txt")) {
//            long st = System.currentTimeMillis();
//            int ch;
//            while ((ch=fis.read()) != -1){
////                System.out.print((char) ch);
//            }
//            long en = System.currentTimeMillis();
//            System.out.println("Time taken by FileInputStream: "+ (en-st));
//        }
//
//        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(root + "\\performance.txt"))) {
//            long st = System.currentTimeMillis();
//            int ch;
//            while ((ch =bis.read()) != -1){
////                System.out.print((char) ch);
//            }
//            long en = System.currentTimeMillis();
//            System.out.println("Time taken by BufferedInputStream: "+ (en-st));
//        }

//        4. Write and read primitives using DataOutputStream & DataInputStream
//        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(root + "\\dataOutputStream.txt"))) {
//            dos.writeInt(5);
//            dos.writeChar('M');
//            dos.writeFloat(25.5f);
//            dos.writeBoolean(true);
//        }
//
//        try (DataInputStream dis = new DataInputStream(new FileInputStream(root+"\\dataOutputStream.txt"))){
//            System.out.println(dis.readInt());
//            System.out.println(dis.readChar());
//            System.out.println(dis.readFloat());
//            System.out.println(dis.readBoolean());
//        }


    }
}
