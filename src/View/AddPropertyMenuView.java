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
package View;

import java.util.Scanner;

public class AddPropertyMenuView implements MenuView {
    private static final String MENU_TITLE = "Add a Property";
    private static final String[] MENU_OPTIONS = {
            "Apartment",
            "Condo",
            "House",
            "Back to Main Menu"
    };

    @Override
    public void display() {
        System.out.println(MENU_TITLE);
        for (int i = 0; i < MENU_OPTIONS.length; i++) {
            System.out.printf("%d. %s\n", i + 1, MENU_OPTIONS[i]);
        }
    }

    @Override
    public int getSelection() {
        Scanner scanner = new Scanner(System.in);
        int selection = -1;
        while (selection < 1 || selection > MENU_OPTIONS.length) {
            System.out.print("Enter your selection: ");
            if (scanner.hasNextInt()) {
                selection = scanner.nextInt();
            } else {
                scanner.next(); // consume the invalid input
            }
        }
        return selection;
    }

    @Override
    public void showError(String message) {
        System.err.println(message);
    }
}

