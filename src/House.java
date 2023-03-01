public class House implements Property {
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
        this.available = false;
    }

    @Override
    public String getAddress() {
        return "streetNumber='" + streetNumber + '\'' +
                ", address=" + address.toString();
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
    public String toString() {
        return "House{" +
                "streetNumber='" + streetNumber + '\'' +
                ", address=" + address +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", squareFootage=" + squareFootage +
                ", available=" + available +
                '}';
    }
}
