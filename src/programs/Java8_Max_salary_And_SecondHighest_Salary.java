package programs;

import model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8_Max_salary_And_SecondHighest_Salary {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(10, "Ramesh", 30, 400000));
        employeeList.add(new Employee(20, "John", 29, 350000));
        employeeList.add(new Employee(30, "Tom", 30, 450000));
        employeeList.add(new Employee(40, "Pramod", 29, 500000));
        //Highest salary
        /*Optional<Employee> emp = employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(emp.get());*/

        //Second Highest salary :
        Optional<Employee> emp = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

        System.out.println(emp.get());

    }
}
