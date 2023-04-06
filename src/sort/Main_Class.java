package sort;

import java.util.ArrayList;
import java.util.Collections;

public class Main_Class {
    public static void main(String[] args) {

        ArrayList<Student_Model_Class> stu = new ArrayList<>();
        stu.add(new Student_Model_Class("Harsh", 23,101));
        stu.add(new Student_Model_Class("Ram", 30,100));
        stu.add(new Student_Model_Class("Manohar", 29,98));

        Collections.sort(stu,new IdComparator());

        System.out.println(stu);

        ArrayList<Student_Model_Class> stu1 = new ArrayList<>(stu);

        Collections.sort(stu1,new NameComparator());

        System.out.println(stu1);

        ArrayList<Student_Model_Class> stu2 = new ArrayList<>(stu);

        Collections.sort(stu2,new AgeComparator());

        System.out.println(stu2);

    }
}
