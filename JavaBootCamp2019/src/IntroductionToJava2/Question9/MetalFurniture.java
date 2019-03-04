package IntroductionToJava2.Question9;

public class MetalFurniture implements FireStressTest {
    @Override
    public void FireTest() {
        System.out.println(" Metal passed FireTest");
    }
    @Override
    public void StressTest(int weight, String typeOfFurniture) {
        if (typeOfFurniture.equals("chair")) {
            if (weight > 10000) {
                System.out.println("metal chair not passed the stesstest");
            } else {
                System.out.println("passed the stesstest");
            }
        } else if (typeOfFurniture.equals("table")) {
            if (weight > 15000) {
                System.out.println("metal table not passed the stesstest");
            } else {
                System.out.println("passed the stesstest");
            }
        }
    }
}
