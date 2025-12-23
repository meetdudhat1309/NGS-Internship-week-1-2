package fileManagement;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FHAssignment08 {
    public static void main(String[] args) throws Exception {

//        Employee Record System:
        final String root = System.getProperty("user.dir") + "\\src\\fileManagement\\files\\employee";

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(root + "\\employeeDetail.txt"))) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Employee Id: ");
            int id = sc.nextInt();
            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter Employee status: ");
            boolean status = sc.nextBoolean();
            System.out.print("Enter Employee name: ");
            String name = sc.next();

            dos.writeInt(id);
            dos.writeDouble(salary);
            dos.writeBoolean(status);
            dos.writeUTF(name);
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(root + "\\employeeDetail.txt"))) {

                System.out.println("****************************************************************");
                System.out.println("Employee Details:");
                System.out.println("Id: " + dis.readInt());
                System.out.println("Salary: " + dis.readDouble());
                System.out.println("Status: " + dis.readBoolean());
                System.out.println("Name: " + dis.readUTF());


        }

    }
}
