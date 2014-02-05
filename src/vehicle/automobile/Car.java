package vehicle.automobile;

public final class Car extends Automobile {

    private static final byte MIN_PASSABGER_NUMBER = 2;
    private static final byte MAX_PASSABGER_NUMBER = 8;
    private static final short MAX_WEIGHT = 3500;

    public Car() {
        super();
    }

    public Car(double speed, double fuelEconomy, String model, double price) {
        super(speed, fuelEconomy, model, price);
    }

    public Car(double fuelEconomy, String creationCompany, String model,
            double price, Engine engine, Chassis chassis, Coachwork coachwork) {
        super(fuelEconomy, creationCompany, model, price, engine, chassis, coachwork);
    }

    public static byte getMinpassangersnumber() {
        return MIN_PASSABGER_NUMBER;
    }

    public static byte getMaxpassangersnumber() {
        return MAX_PASSABGER_NUMBER;
    }

    public static short getMaxweight() {
        return MAX_WEIGHT;
    }
}
