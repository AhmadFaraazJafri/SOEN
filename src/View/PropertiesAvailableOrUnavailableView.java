package View;

import Controller.Main;
import Model.Property;

import java.util.List;

public class PropertiesAvailableOrUnavailableView {

    public void displayProperties(List<Property> properties, boolean available) {
        if (properties.isEmpty()) {
            System.out.println("No properties exist in the system.");
        } else {
            if (available) {
                boolean availablePropertiesExist = false;
                for (Property property : properties) {
                    if (property.isAvailable()) {
                        availablePropertiesExist = true;
                        System.out.println(property);
                    }
                }
                if (!availablePropertiesExist) {
                    System.out.println("No properties are currently available.");
                }
            }
            else {
                boolean availablePropertiesExist = false;
                for (Property property : properties) {
                    if (!property.isAvailable()) {
                        availablePropertiesExist = true;
                        System.out.println(property);
                    }
                }
                if (!availablePropertiesExist) {
                    System.out.println("All properties are currently available.");
                }
            }

        }
    }
}
