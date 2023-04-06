package sort;

import java.util.Comparator;

public class IdComparator implements Comparator<Student_Model_Class> {

    @Override
    public int compare(Student_Model_Class o1, Student_Model_Class o2) {
        return o1.getEmpid()-o2.getEmpid();
    }
}
