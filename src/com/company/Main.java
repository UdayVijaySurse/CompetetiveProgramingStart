package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello");

        ArrayList<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Uday", 26000, "Pune", 27));
        empList.add(new Employee("Rohit", 41000, "Mumbai", 28));
        empList.add(new Employee("Ranoji", 35000, "Kolhapur", 29));
        empList.add(new Employee("Akash", 50000, "Vidarbha", 29));
        empList.add(new Employee("Pritam", 75000, "Ahemadnager", 30));
        empList.add(new Employee("Ketan", 80000, "Mumabi", 30));

        Collections.sort(empList, new SalComparator());

        for (Employee emp : empList) {

            System.out.println("Name:-" + emp.name + " Salary:-" + emp.sal + " Address: -" + emp.address + " Age:-" + emp.age);

        }


    }
}
