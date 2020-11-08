package StructuralPatterns.AdapterPattern.AdapterExample;

import BehavioralPatterns.Memento.MomentoExample.Employee;

import java.util.ArrayList;
import java.util.List;

public class AdapterExample {

    public static void main(String args[]) {
        System.out.println(getEmployeeList());
    }

    public static List<StructuralPatterns.AdapterPattern.AdapterExample.Employee> getEmployeeList() {
        List<StructuralPatterns.AdapterPattern.AdapterExample.Employee> employees = new ArrayList();

        StructuralPatterns.AdapterPattern.AdapterExample.Employee employeeFromDb = new EmployeeDatabase(
                "1234",
                "John",
                "Wick",
                "jwick@emnail");

        EmployeeLdap employeeLdap = new EmployeeLdap(
                "chewie",
                "solo",
                "han",
                "han@solo.com");

        employees.add(new EmployeeAdapterLdap(employeeLdap));

        ((ArrayList) employees).add(employeeFromDb);
        return employees;
    }

}
