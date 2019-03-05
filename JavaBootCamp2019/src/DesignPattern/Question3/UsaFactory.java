package DesignPattern.Question3;

public class UsaFactory {
    static Car builder(CarType carType) {
        Car car = null;
        switch (carType) {
            case MICRO:
                car = new Micro(Location.USA);
                break;
            case MINI:
                car = new Mini(Location.USA);
                break;
        }
        return car;
    }
}
