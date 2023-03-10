package Model;

import java.util.ArrayList;
import java.util.List;

public class House implements Property {
    private List<TenantObserver> observers = new ArrayList<>();
    private String streetNumber;
    private Address address;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private int squareFootage;
    private boolean available;

    public House(String streetNumber, Address address, int numberOfBedrooms, int numberOfBathrooms, int squareFootage) {
        this.streetNumber = streetNumber;
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.squareFootage = squareFootage;
        this.available = true;
    }

    @Override
    public String getAddress() {
        return "streetNumber='" + streetNumber + '\'' +
                "," + address.toString();
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailability(boolean available) {
        this.available = available;
        if (available) {
            notifyTenant();
        }
    }

    @Override
    public String getType() {
        return "House";
    }

    @Override
    public int getUnitNumber() {
        return 0;
    }

    @Override
    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    @Override
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    @Override
    public int getSquareFootage() {
        return squareFootage;
    }

    @Override
    public String getStreetNumber() {
        return streetNumber;
    }

    @Override
    public String toString() {
        return "House{" +
                getAddress() +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", squareFootage=" + squareFootage +
                ", available=" + available +
                '}';
    }

    @Override
    public void registerTenant(TenantObserver tenant) {
        observers.add(tenant);
    }

    @Override
    public void deregisterTenant(TenantObserver tenant) {
        observers.remove(tenant);
    }

    @Override
    public void notifyTenant() {
        if (available) {
            for (TenantObserver tenant : observers) {
                tenant.update(this);
            }
        }

    }
}
