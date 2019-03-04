
/*
Design classes having attributes for furniture where there are wooden chairs and tables, metal chairs and tables.
There are stress and fire tests for each products.
 */


package IntroductionToJava2.Question9;

public class Main {
    public static void main(String[] args) {
        MetalFurniture metalfurniture = new MetalFurniture();
        metalfurniture.FireTest();
        metalfurniture.StressTest(23000, "chair");
        WoodenFurniture furniture = new WoodenFurniture();
        furniture.FireTest();
        furniture.StressTest(900, "table");
    }
}
