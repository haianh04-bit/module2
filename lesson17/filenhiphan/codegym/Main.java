package codegym;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyen Van A", "Hà Nội"));
        students.add(new Student(2, "Nguyen Van B", "Hồ Chí Minh"));
        students.add(new Student(3, "Nguyen Van C", "Đà Nẵng"));
        students.add(new Student(4, "Nguyen Van D", "Cần Thơ"));
        students.add(new Student(5, "Nguyen Van E", "Nha Trang"));
        writeDataToFile("students.txt", students);
        List<Student> readStudents = readDataFromFile("students.txt");
        for (Student student : readStudents) {
            System.out.println(student);
        }
    }
    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

}
