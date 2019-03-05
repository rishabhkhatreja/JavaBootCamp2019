package DesignPattern.Question4;

import java.util.Date;

public class StudentInformation {
    private String firstName;
    private int rollNumber;
    private String lastName;
    private String address;
    private Date dateOfBirth;
    private int admissionNumber;

    @Override
    public String toString() {
        return "StudentInformation{" +
                "firstName='" + firstName + '\'' +
                ", rollNumber=" + rollNumber +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", admissionNumber=" + admissionNumber +
                '}';
    }

    public StudentInformation(StudentBuilderInformation obj) {
        firstName=obj.getFirstName();
        rollNumber=obj.getRollNumber();
        lastName=obj.getLastName();
        address=obj.getAddress();
        dateOfBirth=obj.getDateOfBirth();
        admissionNumber=obj.getAdmissionNumber();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(int admissionNumber) {
        this.admissionNumber = admissionNumber;
    }
}
