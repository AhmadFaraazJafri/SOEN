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

import View.CreatePropertyView;
import View.MenuView;

public class AddPropertyMenuController implements MenuController {
    private final MenuView view;

    public AddPropertyMenuController(MenuView view) {
        this.view = view;
    }

    @Override
    public void start() {
        int selection = -1;
        while (selection != 4) {
            view.display();
            selection = view.getSelection();
            if (selection == 1) {
                // handle "Apartment" menu option
                CreatePropertyController controller = new CreatePropertyController(new CreatePropertyView());
                controller.createProperty(1);
            } else if (selection == 2) {
                CreatePropertyController controller = new CreatePropertyController(new CreatePropertyView());
                controller.createProperty(2);
            } else if (selection == 3) {
                CreatePropertyController controller = new CreatePropertyController(new CreatePropertyView());
                controller.createProperty(3);
            } else if (selection == 4) {
                System.out.println("Returning to Main Menu...");
            } else {
                view.showError("Invalid selection.");
            }
        }
    }
}

