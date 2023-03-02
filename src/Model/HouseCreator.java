package Model;

public class HouseCreator extends PropertyCreator {
    @Override
    public Property createProperty(String streetNumber, Address address, int apartmentNumber, int numberOfBedrooms, int numberOfBathrooms, int squareFootage) {
        return new House(streetNumber, address, numberOfBedrooms, numberOfBathrooms, squareFootage);
    }
}
