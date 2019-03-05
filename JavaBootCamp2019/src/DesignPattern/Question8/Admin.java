package DesignPattern.Question8;

public class Admin implements Information {
    String admin;

    protected Student student;

    public Admin(Student student,String admin)
    {
        this.admin=admin;
        this.student = student;
    }
    public Admin(Student student)
    {
        this.student = student;
    }
    @Override
    public void info() {
        System.out.println("View the information!!");
    }
}
