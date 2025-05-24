package comparable;

import java.util.*;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getAge() > s2.getAge()) {
            return 1;
        } else if (s1.getAge() < s2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Student student = new Student("Kiên",30,"HT");
        Student student1 = new Student("Nam",26,"HN");
        Student student2 = new Student("Anh",36,"HT");
        Student student3 = new Student("Tung",36,"HT");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student s : lists) {
            System.out.println(s.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi: ");
        for (Student s : lists) {
            System.out.println(s.toString());
        }
    }
}
