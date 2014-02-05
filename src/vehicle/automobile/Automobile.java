package vehicle.automobile;

import java.math.BigDecimal;
import vehicle.Vehicle;

public abstract class Automobile extends Vehicle implements Drive {

    protected double fuelEconomy;
    protected String creationCompany;
    protected String model;
    protected double price;
    protected Engine engine;
    protected Chassis chassis;
    protected Coachwork coachwork;

    public Automobile() {
        super();
    }

    public Automobile(double speed, double fuelEconomy, String model, double price) {
        super(speed);
        this.fuelEconomy = fuelEconomy;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return model + " has prise: " + round(price, 2) + " and max speed: " + round(speed, 2);
    }

    public Automobile(double fuelEconomy, String creationCompany, String model,
            double price, Engine engine, Chassis chassis, Coachwork coachwork) {
        super();
        this.fuelEconomy = fuelEconomy;
        this.creationCompany = creationCompany;
        this.model = model;
        this.price = price;
        this.engine = engine;
        this.chassis = chassis;
        this.coachwork = coachwork;
    }

    protected class Engine {

        int volume;

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }
    }

    protected class Chassis {

        int wheelsNumber;

        public int getWheelsNumber() {
            return wheelsNumber;
        }

        public void setWheelsNumber(int wheelsNumber) {
            this.wheelsNumber = wheelsNumber;
        }
    }

    protected class Coachwork {

        int passengersNumber;
        int luggageWeight;
        double volume;

        public int getPassengersNumber() {
            return passengersNumber;
        }

        public void setPassengersNumber(int passengersNumber) {
            this.passengersNumber = passengersNumber;
        }

        public int getLuggageWeight() {
            return luggageWeight;
        }

        public void setLuggageWeight(int luggageWeight) {
            this.luggageWeight = luggageWeight;
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }
    }

    public String getCreationCompany() {
        return creationCompany;
    }

    public void setCreationCompany(String creationCompany) {
        this.creationCompany = creationCompany;
    }

    public double getFuelEconomy() {
        return fuelEconomy;
    }

    public void setFuelEconomy(double fuelEconomy) {
        this.fuelEconomy = fuelEconomy;
    }

    @Override
    public void drive() {
        move();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }
}
