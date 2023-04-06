package sort;

import java.util.Comparator;

public class NameComparator implements Comparator<Student_Model_Class> {
    @Override
    public int compare(Student_Model_Class o1, Student_Model_Class o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
