package DesignPattern.Question3;

class Mini extends Car {

    public Mini(Location location) {
        super(CarType.MINI, location);
    }

    @Override
    void construct() {
        System.out.println("Mini Car");
    }
}
