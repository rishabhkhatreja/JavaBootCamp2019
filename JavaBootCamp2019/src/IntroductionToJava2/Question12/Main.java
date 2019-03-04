/*
What will be the output on new Child(); ?
class Parent extends Grandparent {
{
System.out.println("instance - parent");
}
public Parent() {
System.out.println("constructor - parent");
}
static {
System.out.println("static - parent");
}
}
class Grandparent {

static {
System.out.println("static - grandparent");
}
{
System.out.println("instance - grandparent");
}
public Grandparent() {
System.out.println("constructor - grandparent");
}
}
class Child extends Parent {
public Child() {
System.out.println("constructor - child");
}
static {
System.out.println("static - child");
}
{
System.out.println("instance - child");
}
}
 */

package IntroductionToJava2.Question12;

public class Main {
    public static void main(String[] args) {
      /* In this Question We have to tell what is the output on creating child object....!
        Output:
        Static - Grandparent
        Static - parent
        Static - child
        Instance - Grandparent
        Constructor - Grandparent
        Instance -Parent
        Constructor - parent
        Instance - Child
        Constructor -Child
        */
      new Child();
    }
}

