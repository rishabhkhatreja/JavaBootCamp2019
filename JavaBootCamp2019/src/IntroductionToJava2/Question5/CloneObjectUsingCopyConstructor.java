package IntroductionToJava2.Question5;

public class CloneObjectUsingCopyConstructor {
    private int id;
    private String name;
    public CloneObjectUsingCopyConstructor(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public CloneObjectUsingCopyConstructor(CloneObjectUsingCopyConstructor obj)
    {
        this.id=obj.id;
        this.name=obj.name;
    }
    @Override
    public String toString() {
        return "Thing{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
