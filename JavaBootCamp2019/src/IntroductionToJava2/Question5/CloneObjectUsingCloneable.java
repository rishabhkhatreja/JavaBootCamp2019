package IntroductionToJava2.Question5;

public class CloneObjectUsingCloneable implements Cloneable {
    private int id;
    private String name;
    public CloneObjectUsingCloneable(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString() {
        return "Thing{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
