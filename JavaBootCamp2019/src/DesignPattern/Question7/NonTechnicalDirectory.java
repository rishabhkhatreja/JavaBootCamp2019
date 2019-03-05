package DesignPattern.Question7;

import java.util.ArrayList;
import java.util.List;

public class NonTechnicalDirectory implements Directory {
    List<NonTechnical> nonTechnicalEmployees;

    public NonTechnicalDirectory() {
        nonTechnicalEmployees = new ArrayList<>();
    }

    public List<NonTechnical> getNonTechnicalEmployees() {
        return nonTechnicalEmployees;
    }

    public void setNonTechnicalEmployees(List<NonTechnical> nonTechnicalEmployees) {
        this.nonTechnicalEmployees = nonTechnicalEmployees;
    }

    @Override
    public void showDirectoryInfo() {
        nonTechnicalEmployees.forEach(e -> e.showDirectoryInfo());
    }
}
