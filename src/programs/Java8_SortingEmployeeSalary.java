package programs;

import model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_SortingEmployeeSalary {
    public static void main(String[] args) {

        List <Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(10, "Ramesh", 30, 400000));
        employeeList.add(new Employee(20, "John", 29, 350000));
        employeeList.add(new Employee(30, "Tom", 30, 450000));
        employeeList.add(new Employee(40, "Pramod", 29, 500000));

        //Ascending Order
        List < Employee > sorting_in_ascending_order = employeeList.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(sorting_in_ascending_order);

        //Descending order
        /*
        List < Employee > sorting_in_descending_order = employeeList.stream()
                        .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                        .collect(Collectors.toList());
        System.out.println(sorting_in_descending_order); */

        //By Age
        /*List < Employee > sorting_in_ascending_order = employeeList.stream()
                .sorted(Comparator.comparingLong(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(sorting_in_ascending_order);*/

    }

}

