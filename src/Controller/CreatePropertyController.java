package Controller;

import Model.*;
import View.CreatePropertyView;


public class CreatePropertyController {
    private final CreatePropertyView view;

    public CreatePropertyController(CreatePropertyView view) {
        this.view = view;
    }

    public void createProperty(int type) {
        String streetNumber = view.getStreetNumber();
        Address address = view.getAddress();
        int unitNumber = view.getUnitNumber();
        int numberOfBedrooms = view.getNumberOfBedrooms();
        int numberOfBathrooms = view.getNumberOfBathrooms();
        int squareFootage = view.getSquareFootage();
        if (type == 1) {
            PropertyCreator creator = new ApartmentCreator();
            Property property = creator.createProperty(streetNumber,address,  unitNumber,  numberOfBedrooms,  numberOfBathrooms,  squareFootage);
            //store the property
        } else if (type == 2) {
            PropertyCreator creator = new CondoCreator();
            Property property = creator.createProperty(streetNumber,address,  unitNumber,  numberOfBedrooms,  numberOfBathrooms,  squareFootage);
        }
        else if (type == 3) {
            PropertyCreator creator = new HouseCreator();
            Property property = creator.createProperty(streetNumber,address,  unitNumber,  numberOfBedrooms,  numberOfBathrooms,  squareFootage);

        }
    }
}
