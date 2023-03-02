package Model;

public class Condo implements Property {
    private String streetNumber;
    private Address address;
    private int unitNumber;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private int squareFootage;
    private boolean available;

    public Condo(String streetNumber, Address address, int unitNumber, int numberOfBedrooms, int numberOfBathrooms, int squareFootage) {
        this.streetNumber = streetNumber;
        this.address = address;
        this.unitNumber = unitNumber;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.squareFootage = squareFootage;
        this.available = false;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(int unitNumber) {
        this.unitNumber = unitNumber;
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

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Condo{" +
                "streetNumber='" + streetNumber + '\'' +
                ", address=" + address +
                ", unitNumber=" + unitNumber +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", squareFootage=" + squareFootage +
                ", available=" + available +
                '}';
    }

    @Override
    public String getAddress() {
        return "UnitNumber=" + unitNumber + ", StreetNumber='" + streetNumber + '\'' + ", Address=" + address.toString();
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public void setAvailability(boolean available) {
        this.available = available;
    }

    @Override
    public String getType() {
        return "Condo";
    }
}