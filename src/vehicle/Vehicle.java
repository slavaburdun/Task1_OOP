package vehicle;

import classifications.Country;
import java.util.Date;

public abstract class Vehicle implements Move {

    protected Date creationData;
    protected Country creationCountry;
    protected double height, width, length, weight;
    protected boolean state;
    protected double speed;

    public Vehicle() {
        super();
    }

    public Vehicle(double speed) {
        super();
        this.speed = speed;
    }

    public Vehicle(Date creationData, Country creationCountry, double height,
            double width, double length, double weight, boolean state,
            double speed) {
        super();
        this.creationData = creationData;
        this.creationCountry = creationCountry;
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.state = state;
        this.speed = speed;
    }

    public Date getCreationData() {
        return creationData;
    }

    public void setCreationData(Date creationData) {
        this.creationData = creationData;
    }

    public Country getCreationCountry() {
        return creationCountry;
    }

    public void setCreationCountry(Country creationCountry) {
        this.creationCountry = creationCountry;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public void move() {
        if (!isState()) {
            setState(true);
        }
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
}
