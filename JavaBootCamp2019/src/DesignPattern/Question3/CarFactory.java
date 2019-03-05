package DesignPattern.Question3;

public class CarFactory {
    static Car builder(CarType carType, Location location) {
        Car car = null;
        switch (location) {
            case USA:
                car = UsaFactory.builder(carType);
                break;
            case INDIA:
                car = IndianFactory.builder(carType);
                break;
        }
        return car;
    }
}
