package exception.exQ03;

import java.util.Scanner;

public class ExceptionQ3 {
//    Q1: File Upload and Processing Module
//    Requirements:
//    Check if:
//    File type is supported (e.g., PDF, DOCX).
//    File size does not exceed a predefined limit.


    public static void main(String[] args) throws InvalidFileFormat, FileSizeLimitExceedException {
        Scanner sc = new Scanner(System.in);

        FileModel file = new FileModel();

        System.out.println("Enter file name: ");
        file.setFileName(sc.next());
        System.out.println("Enter file size: ");
        file.setFileSize(sc.nextInt());

        System.out.println("Choose file type: \n1.PDF\n2.DOCX\n3.PPT");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                file.setFileType(FileType.PDF);
                break;
            case 3:
                file.setFileType(FileType.DOCX);
                break;
            case 4:
                file.setFileType(FileType.PPT);
                break;
            default: file.setFileType(FileType.DEFAULT);
        }

        if (file.getFileType() == FileType.DEFAULT) throw new InvalidFileFormat("Unsupported file format!");
        if (file.getFileSize()>5) throw new FileSizeLimitExceedException("File size should be less than 5MB");

    }
}

