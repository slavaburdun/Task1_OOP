package vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vehicle.automobile.Car;

public class Taksopark {

    private List<Car> cars;

    public Taksopark(List<Car> cars) {
        super();
        this.cars = cars;
    }

    public Taksopark() {
        cars = new ArrayList<Car>();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public static Comparator<Car> getCompBySpeed() {
        return compBySpeed;
    }

    public static void setCompBySpeed(Comparator<Car> compBySpeed) {
        Taksopark.compBySpeed = compBySpeed;
    }
    static Comparator<Car> compBySpeed = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            if (o1.getSpeed() > o2.getSpeed()) {
                return 1;
            } else if (o1.getSpeed() < o2.getSpeed()) {
                return -1;
            }
            return 0;
        }
    };

    public int calculateAutoparkPrise() {
        int autoParkPrise = 0;
        for (Car car : cars) {
            autoParkPrise += car.getPrice();
        }
        return autoParkPrise;
    }

    public void sortCarsByFuelEconomy() {
        Comparator<Car> c = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.getFuelEconomy() > o2.getFuelEconomy()) {
                    return 1;
                } else if (o1.getFuelEconomy() < o2.getFuelEconomy()) {
                    return -1;
                }
                return 0;
            }
        };
        Collections.sort(cars, c);
    }

    public void sortCarsBySpeed() {
        Collections.sort(cars, compBySpeed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car).append("\n");
        }
        return sb.toString();
    }

    public Car findCarWithSpeedBetween(double min, double max) {

        Comparator<Car> compByRoundSpeed = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if ((int) o1.getSpeed() > (int) o2.getSpeed()) {
                    return 1;
                } else if ((int) o1.getSpeed() < (int) o2.getSpeed()) {
                    return -1;
                }
                return 0;
            }
        };
        int indexOfFirstFoundCar = -1;

        Car firstFoundCar = new Car();

        int speed = (int) min;
        if ((int) min != min) {
            speed++;
        }

        for (int i = 0; i <= max - min; i++) {

            firstFoundCar.setSpeed(speed + i);
            indexOfFirstFoundCar = Collections.binarySearch(cars, firstFoundCar, compByRoundSpeed);
            if (indexOfFirstFoundCar > -1) {
                break;
            }
        }
        if (indexOfFirstFoundCar > -1) {
            return cars.get(indexOfFirstFoundCar);
        } else {
            return null;
        }
    }
}
