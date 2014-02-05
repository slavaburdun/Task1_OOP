package vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import vehicle.automobile.Car;

public class Runner {

    public static void main(String[] args) {
        Random rand = new Random();

        List<Car> listOfCars = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            listOfCars.add(new Car(200 + (350 - 200) * rand.nextDouble(),
                    10 + (30 - 10) * rand.nextDouble(), "Car № " + i,
                    50000 + (100000 - 50000) * rand.nextDouble()));
        }

        Taksopark myTaksopark = new Taksopark(listOfCars);

        System.out.println(myTaksopark);

        myTaksopark.sortCarsBySpeed();

        System.out.println(myTaksopark);

        System.out.println("Autopark prise = " + myTaksopark.calculateAutoparkPrise());
        System.out.println();

        System.out.println("Car with speed between (340, 350): "
                + myTaksopark.findCarWithSpeedBetween(340, 350));

    }
}
