/***
 * ............................................................
 *    Project Phase 1 , SOEN 6441
 *    ©(Faraaz, Himangshu, Shivesh)
 *    Written by:
 *                @author Himangshu Shekhar Baruah , Student ID 40229774
 *                @author Ahmad Faraaz Jafri, Student ID 40232742
 *                @author Shivesh Chaudhary, Student ID 40228107
 * ............................................................
 */
package Controller;

import Model.Lease;
import Model.Property;
import Model.Tenant;
import View.AddPropertyMenuView;
import View.MainMenuView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static List<Property> properties = new ArrayList<>();
    public static List<Tenant> tenants = new ArrayList<>();
    public static List<Lease> leases = new ArrayList<>();

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