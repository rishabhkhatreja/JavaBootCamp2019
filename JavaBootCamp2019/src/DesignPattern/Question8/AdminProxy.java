package DesignPattern.Question8;

public class AdminProxy extends Admin {

    public AdminProxy(Student student,String admin) {
        super(student,admin);

    }
    public AdminProxy(Student student) {
        super(student);

    }
        @Override
        public void info()
        {
            if(admin!=null)
            {
                System.out.println("Admin have the access to the student information!!");
                super.info();
            }
            else
            {
                System.out.println("you don'nt have access");
            }
        }
}

