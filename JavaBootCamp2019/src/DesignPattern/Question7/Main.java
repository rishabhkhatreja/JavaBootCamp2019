
//Implement Composite Design Pattern to maintaing the directories of employees on the basis of departments.

package DesignPattern.Question7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Technical technicalEmployee1 = new Technical("Rishabh", "Jvm");
        Technical technicalEmployee2 = new Technical("Ram", "Jvm");

        NonTechnical nonTechnicalEmployee1 = new NonTechnical("Ramesh");
        NonTechnical nonTechnicalEmployee2 = new NonTechnical("abc");

        TechnicalDirectory technicalEmployeeDirectory = new TechnicalDirectory();
        technicalEmployeeDirectory.getTechnicalEmployees().addAll(Arrays.asList(technicalEmployee1, technicalEmployee2));

        NonTechnicalDirectory nonTechnicalEmployeeDirectory = new NonTechnicalDirectory();
        nonTechnicalEmployeeDirectory.getNonTechnicalEmployees().addAll(Arrays.asList(nonTechnicalEmployee1, nonTechnicalEmployee2));

        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        employeeDirectory.getEmployeeDirectories().addAll(Arrays.asList(technicalEmployeeDirectory, nonTechnicalEmployeeDirectory));

        employeeDirectory.showDirectoryInfo();
    }
}

