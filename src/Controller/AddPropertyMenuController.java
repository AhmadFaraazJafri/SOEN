package Controller;

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
            } else if (selection == 2) {
                // handle "Condo" menu option
            } else if (selection == 3) {
                // handle "House" menu option
            } else if (selection == 4) {
                System.out.println("Returning to Main Menu...");
            } else {
                view.showError("Invalid selection.");
            }
        }
    }
}

