package Controller;

import Controller.AddPropertyMenuController;
import Controller.MenuController;
import Model.Property;
import View.AddPropertyMenuView;
import Controller.MainMenuController;
import View.MainMenuView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<Property> properties = new ArrayList<Property>();
    public static void main(String[] args) {
        // create submenu controllers and add them to a map
        Map<Integer, MenuController> submenuControllers = new HashMap<>();
        submenuControllers.put(1, new AddPropertyMenuController(new AddPropertyMenuView()));

        // create main menu controller with the submenu controllers map
        MenuController mainMenuController = new MainMenuController(new MainMenuView(), submenuControllers);

        // start the main menu controller
        mainMenuController.start();
    }
}