
//Implement Builder pattern to create a student object with more than 6 fields.

package DesignPattern.Question4;

public class Main {
    public static void main(String[] args) {
        StudentInformation student=new StudentBuilderInformation().setFirstName("rishabh").setLastName("khatreja").build();
        System.out.println(student);
    }
}
