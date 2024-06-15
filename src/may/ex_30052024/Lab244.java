package may.ex_30052024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab244 {
    public static void main(String[] args) {
//        List<Integer> myMarks = new ArrayList<>();
//        myMarks.add(89);
//        myMarks.add(91);
//        myMarks.add(87);
//        Collections.sort(myMarks);
//        System.out.println(myMarks);

        Student student = new Student(10,"Meghana");
        Student student1 = new Student(1,"Brid");
        Student student2 = new Student(11,"Pratz");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);
        students.add(student2);
        System.out.println("Before Sort");
        System.out.println(students);
        System.out.println("After Sort");
        Collections.sort(students , new SortByIdDesc());
        System.out.println(students);


    }
}
