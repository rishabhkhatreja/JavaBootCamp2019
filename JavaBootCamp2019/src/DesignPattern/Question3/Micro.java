package DesignPattern.Question3;

class Micro extends Car {

    public Micro(Location location) {
        super(CarType.MICRO, location);
    }

    @Override
    void construct() {
        System.out.println("Micro Car");
    }
}
