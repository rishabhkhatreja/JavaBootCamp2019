//WAP to show object cloning in java using cloneable and copy constructor both.

package IntroductionToJava2.Question5;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneObjectUsingCopyConstructor obj1=new CloneObjectUsingCopyConstructor(101,"rishabh");
        CloneObjectUsingCopyConstructor cloneobj=new CloneObjectUsingCopyConstructor(obj1);
        System.out.println("object="+obj1);
        System.out.println("cloneobject using copy constructor="+cloneobj);
        CloneObjectUsingCloneable obj2=new CloneObjectUsingCloneable(102,"ram");
        CloneObjectUsingCloneable obj3=(CloneObjectUsingCloneable) obj2.clone();
        System.out.println("object="+obj2);
        System.out.println("cloneobject using cloneable interface="+obj3);

    }
}
