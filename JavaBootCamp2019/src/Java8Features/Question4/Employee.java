package Java8Features.Question4;

public class Employee {
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city)
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
