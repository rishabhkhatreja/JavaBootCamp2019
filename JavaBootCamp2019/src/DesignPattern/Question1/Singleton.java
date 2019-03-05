package DesignPattern.Question1;

class Singleton {
    static Singleton object;
    private String name;
    private int rollno;
    private Singleton(String name,int rollno)
    {
          this.name=name;
          this.rollno=rollno;
    }
    static Singleton getInstance(String name,int rollno)
    {
        if(object==null)
        {
            return object=new Singleton(name,rollno);
        }
        return object;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }
}
