package fileManagement;

import java.io.File;
import java.util.Arrays;

public class FileDemo {
    public static void main(String[] args) {

        String PATH = "C:" + File.separator + "Meet" + File.separator + "Java" + File.separator + "DataStructure" + File.separator + "Internship" + File.separator + "InternshipWeek1N2" + File.separator + "src" + File.separator + "fileManagement" + File.separator + "test";
        File file = new File(PATH);
        System.out.println(file.isFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.length());
        System.out.println(Arrays.toString(file.list()));
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        boolean isExecutable = file.setExecutable(false);
        System.out.println(isExecutable);
    }
}
