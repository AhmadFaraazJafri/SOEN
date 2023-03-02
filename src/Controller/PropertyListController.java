package Controller;

import Model.Property;
import View.PropertyListView;

import java.util.List;

public class PropertyListController {
    private Main propertyManager;
    private PropertyListView propertyListView;

    public PropertyListController(Main propertyManager, PropertyListView propertyListView) {
        this.propertyManager = propertyManager;
        this.propertyListView = propertyListView;
    }

    public void displayProperties() {
        List<Property> properties = Main.properties;
        propertyListView.display(properties);
    }
}
