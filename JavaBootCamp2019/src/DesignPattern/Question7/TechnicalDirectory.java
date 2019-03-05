package DesignPattern.Question7;

import java.util.ArrayList;
import java.util.List;

public class TechnicalDirectory implements Directory {
    List<Technical> technicalEmployees;

    public TechnicalDirectory() {
        technicalEmployees = new ArrayList<>();
    }

    public List<Technical> getTechnicalEmployees() {
        return technicalEmployees;
    }

    public void setTechnicalEmployees(List<Technical> technicalEmployees) {
        this.technicalEmployees = technicalEmployees;
    }

    @Override
    public void showDirectoryInfo() {
        technicalEmployees.forEach(e -> e.showDirectoryInfo());
    }
}
