
//Implement Singleton Design Pattern on a dummy class.

package DesignPattern.Question1;

public class Main {
    public static void main(String[] args) {
     Singleton object=Singleton.getInstance("rishabh",102);
     System.out.println(object);
     Singleton object1=Singleton.getInstance("ram",103);
        System.out.println(object1);
    }
}
