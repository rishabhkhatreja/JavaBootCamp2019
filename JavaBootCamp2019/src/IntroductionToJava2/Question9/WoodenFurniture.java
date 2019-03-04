package IntroductionToJava2.Question9;

public class WoodenFurniture implements FireStressTest {
    @Override
    public void FireTest() {
        System.out.println("wooden chair not passed FireTest");
    }
    @Override
    public void StressTest(int weight, String typeOfFurniture) {
        if (typeOfFurniture.equals("chair")) {
            if (weight > 2000) {
                System.out.println("wooden furniture not passed the stesstest");
            } else {
                System.out.println("passed the stesstest");
            }
        } else if (typeOfFurniture.equals("table")) {
            if (weight > 5000) {
                System.out.println("wooden table not passed the stesstest");
            } else {
                System.out.println("passed the stesstest");
            }
        }
    }
}
