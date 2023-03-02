package Controller;

import View.MenuView;
import View.PropertyListView;

import java.util.Map;

public class MainMenuController implements MenuController {
    private final MenuView view;
    private final Map<Integer, MenuController> submenuControllers;

    public MainMenuController(MenuView view, Map<Integer, MenuController> submenuControllers) {
        this.view = view;
        this.submenuControllers = submenuControllers;
    }

    @Override
    public void start() {
        int selection = -1;
        while (selection != 9) {
            view.display();
            selection = view.getSelection();
            if (selection == 1) {
                submenuControllers.get(1).start();
            } else if (selection == 2) {
                // handle "Add a tenant" menu option
            } else if (selection == 3) {
                // handle "Rent a unit" menu option
            } else if (selection == 4) {
                // handle "Display properties" menu option
                Main main = new Main();
                PropertyListController propertyListController = new PropertyListController(main, new PropertyListView());
                propertyListController.displayProperties();
            } else if (selection == 5) {
                // handle "Display tenants" menu option
            } else if (selection == 6) {
                // handle "Display rented units" menu option
            } else if (selection == 7) {
                // handle "Display vacant units" menu option
            } else if (selection == 8) {
                // handle "Display all leases" menu option
            } else if (selection == 9) {
                System.out.println("Goodbye!");
            } else {
                view.showError("Invalid selection.");
            }
        }
    }
}

