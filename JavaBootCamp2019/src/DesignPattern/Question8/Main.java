
//Implement proxy design for accessing Record of a student and allow the access only to Admin.

package DesignPattern.Question8;

public class Main {
    public static void main(String[] args)
    {
        Student student=new Student("rishabh",101,"BCA");
        Information obj=new AdminProxy(student);
        obj.info();
    }
}
