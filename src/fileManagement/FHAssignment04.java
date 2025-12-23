package fileManagement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FHAssignment04 {
    public static void main(String[] args) {
//        TODO: Scanner
        final String root = System.getProperty("user.dir") + "\\src\\fileManagement\\files";
//        try {
//            File file = new File(root+"\\marks.txt");
//            Map<Integer, Integer> map = new HashMap<>();
//            int cnt = 0;
//            Scanner sc = new Scanner(file);
//            float sum = 0;
//            while (sc.hasNextInt()){
//                int num = sc.nextInt();
//                System.out.println(num);
//                map.put(num, map.getOrDefault(num, 0)+1);
//                sum+=num;
//                cnt++;
//            }
//            sc.close();
//            System.out.println("Sum of marks: "+ sum);
//            System.out.println("Frequency of marks: "+map);
//            System.out.println("Average of marks: "+ (sum/(float) cnt));
//
//        } catch (FileNotFoundException e) {
//            System.out.println("Something went wrong!");
//            throw new RuntimeException(e);
//        }

//        Q-1:
//        Listing with File Objects
        final String root2 = System.getProperty("user.dir") + "\\src\\fileManagement";
        File file = new File(root2);
        File[] list = file.listFiles();
        if (list != null) {
            for (File f: list){
                if (f.isFile()){
                    System.out.println("File: "+ f.getName());
                }else {
                    System.out.println("Directory: "+ f.getName());
                }
            }
        }


    }
}
