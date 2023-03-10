package Model;

import java.util.ArrayList;
import java.util.List;

public class Apartment implements Property {
    public List<TenantObserver> observers = new ArrayList<>();
    private Address address;
    private int apartmentNumber;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private int squareFootage;
    private boolean available;

    public Apartment(Address address, int apartmentNumber, int numberOfBedrooms, int numberOfBathrooms, int squareFootage) {
        this.address = address;
        this.apartmentNumber = apartmentNumber;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.squareFootage = squareFootage;
        this.available = true;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    @Override
    public String getStreetNumber() {
        return null;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String getAddress() {
        return "Apt #" + apartmentNumber + ", " + address.toString();
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailability(boolean available) {
        this.available = available;
            notifyTenant();
    }

    @Override
    public String getType() {
        return "Apartment";
    }

    @Override
    public int getUnitNumber() {
        return apartmentNumber;
    }

    @Override
    public String toString() {
        return "Apartment{" +
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
