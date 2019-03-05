package DesignPattern.Question3;

class IndianFactory{
    static Car builder(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new Micro(Location.INDIA);
                break;
            case MINI:
                car = new Mini(Location.INDIA);
                break;
        }
        return car;
    }
}

