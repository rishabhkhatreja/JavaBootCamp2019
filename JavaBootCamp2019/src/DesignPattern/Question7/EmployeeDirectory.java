package DesignPattern.Question7;

import java.util.ArrayList;
import java.util.List;

class EmployeeDirectory implements Directory {
    List<Directory> employeeDirectories;

    public EmployeeDirectory() {
        employeeDirectories = new ArrayList<>();
    }

    public List<Directory> getEmployeeDirectories() {
        return employeeDirectories;
    }

    public void setEmployeeDirectories(List<Directory> employeeDirectories) {
        this.employeeDirectories = employeeDirectories;
    }

    @Override
    public void showDirectoryInfo() {
        employeeDirectories.forEach(e -> e.showDirectoryInfo());
    }
}
