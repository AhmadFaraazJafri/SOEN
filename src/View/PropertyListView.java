package View;

import Model.Property;

import java.util.List;

public class PropertyListView {
    public void display(List<Property> properties) {
        if (properties.isEmpty()) {
            System.out.println("No properties found.");
        } else {
            for (Property property : properties) {
                System.out.println(property.toString());
            }
        }
    }
}
