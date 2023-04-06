package sort;

public class Student_Model_Class {

    private String name;
    private int age;
    private int empid;

    public Student_Model_Class(String name, int age, int empid) {
        this.name = name;
        this.age = age;
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", empid=" + empid +
                '}';
    }

}
