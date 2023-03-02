package Model;

public class CondoCreator extends PropertyCreator {

    @Override
    public Property createProperty(String streetNumber, Address address, int apartmentNumber, int numberOfBedrooms, int numberOfBathrooms, int squareFootage) {
        return new Condo(streetNumber, address, apartmentNumber, numberOfBedrooms, numberOfBathrooms, squareFootage);
    }
}
