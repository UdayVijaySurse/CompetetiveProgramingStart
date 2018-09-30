package com.company;

import java.util.Comparator;

public class SalComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        if (o1.sal == o2.sal)
            return 0;
        else if (o1.sal > o2.sal)
            return 1;
        else
            return -1;
    }

}
