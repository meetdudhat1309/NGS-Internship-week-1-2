package fileManagement;

import java.io.*;

public class FileIOStream {
    public static void main(String[] args) {
        String PATH = "C:" + File.separator + "Meet" + File.separator + "Java" + File.separator + "DataStructure" + File.separator + "Internship" + File.separator + "InternshipWeek1N2" + File.separator + "src" + File.separator + "fileManagement" + File.separator;

//        Read file from provided path
        try (FileInputStream fis = new FileInputStream(PATH + "test")) {
            int ch;
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Write data into a file


        try (FileOutputStream fos = new FileOutputStream(PATH + "newFile")) {
            String data = "This is the new data for the new file:)";
            byte[] bytes = data.getBytes();

            fos.write(bytes);
            System.out.println("Data successfully written on the file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
