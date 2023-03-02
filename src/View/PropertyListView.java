package View;

import Model.Property;

import java.util.List;

public class PropertyListView {
    public void display(List<Property> properties) {
        if (properties.isEmpty()) {
            System.out.println("No properties found.");
        } else {
            int number = 1;
            for (Property property : properties) {
                System.out.println(number++ + ". " + property.toString());
            }
        }
    }
}
