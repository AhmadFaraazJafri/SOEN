package Model;

public class ApartmentCreator extends PropertyCreator {
    @Override
    public Property createProperty(String streetNumber, Address address, int apartmentNumber, int numberOfBedrooms, int numberOfBathrooms, int squareFootage) {
        return new Apartment(address, apartmentNumber, numberOfBedrooms, numberOfBathrooms, squareFootage);
    }
}
