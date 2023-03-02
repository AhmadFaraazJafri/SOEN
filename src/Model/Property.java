package Model;

public interface Property {
    String getAddress();
    boolean isAvailable();
    void setAvailability(boolean available);
    String getType();

    int getUnitNumber();

    int getNumberOfBedrooms();

    int getNumberOfBathrooms();

    int getSquareFootage();

    String getStreetNumber();

    String toString();
}
