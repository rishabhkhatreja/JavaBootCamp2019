package DesignPattern.Question4;

import java.util.Date;

public class StudentBuilderInformation {
    private String firstName;
    private int rollNumber;
    private String lastName;
    private String address;
    private Date dateOfBirth;
    private int admissionNumber;


    public String getFirstName() {
        return firstName;
    }

    public StudentBuilderInformation setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public StudentBuilderInformation setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public StudentBuilderInformation setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public StudentBuilderInformation setAddress(String address) {
        this.address = address;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public StudentBuilderInformation setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public StudentBuilderInformation setAdmissionNumber(int admissionNumber) {
        this.admissionNumber = admissionNumber;
        return this;
    }
    public StudentInformation build()
    {
    return new StudentInformation(this);
    }
}
