package programs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_Duplicate_Elements_And_Unique {
    public static void main(String[] args) {
        List<String> companies = new ArrayList<String>();
        companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); // duplicate
        companies.add("Google");
        companies.add("Apple"); // duplicate

        // Finding Duplicate elements :
        /*   Set<String> duplicateCompanies = companies.stream()
                .filter(company -> Collections.frequency(companies, company) > 1)
                .collect(Collectors.toSet());
        //print duplicate elements
        System.out.println("Duplicate elements :");
        duplicateCompanies.forEach(System.out::println); */

        //Finding Unique Elements :
        List<String> distinctCompanies = companies.stream().distinct()
                .collect(Collectors.toList());
        // print unique elements
        System.out.println("Unique elements : ");
        distinctCompanies.forEach(System.out::println);

    }
}




