package Model;

public abstract class PropertyCreator {
    public abstract Property createProperty(String streetNumber, Address address, int apartmentNumber, int numberOfBedrooms, int numberOfBathrooms, int squareFootage);
}
