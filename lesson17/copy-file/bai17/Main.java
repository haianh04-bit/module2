package bai17;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File des) throws IOException {
        Files.copy(source.toPath(), des.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStem(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try{
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập tập tin nguồn:");
        String sourcePath = sc.nextLine();
        System.out.printf("Nhập tập tin đích:");
        String destPath = sc.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            // copyFileUsingStem(sourceFile, destFile);
            System.out.printf("Sao chép hoàn tất");
        } catch (IOException ioe) {
            System.out.printf("Không thể sao chép tệp đó");
            System.out.printf(ioe.getMessage());
        }
    }
}
