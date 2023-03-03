package Controller;

import Model.Property;
import View.PropertiesAvailableOrUnavailableView;

import java.util.List;

public class PropertiesAvailableOrUnavailableController {
    private PropertiesAvailableOrUnavailableView view;

    public PropertiesAvailableOrUnavailableController(PropertiesAvailableOrUnavailableView view) {
        this.view = view;
    }

    public void displayProperties(List<Property> properties, boolean availableOnly) {
        view.displayProperties(properties, availableOnly);
    }
}
