package Controller;

import View.*;

import java.util.Map;

public class MainMenuController implements MenuController {
    private final MenuView view;
    private final Map<Integer, MenuController> submenuControllers;

    Main main = new Main();

    public MainMenuController(MenuView view, Map<Integer, MenuController> submenuControllers) {
        this.view = view;
        this.submenuControllers = submenuControllers;
    }

    @Override
    public void start() {
        int selection = -1;
        while (selection != 13) {
            view.display();
            selection = view.getSelection();
            if (selection == 1) {
                submenuControllers.get(1).start();
            } else if (selection == 2) {
                // handle "Add a tenant" menu option
                CreateTenantController controller = new CreateTenantController(new CreateTenantView());
                controller.createTenant();
            } else if (selection == 3) {
                // handle "Rent a unit" menu option
                RentPropertyController rentPropertyController = new RentPropertyController(new RentPropertyView());
                rentPropertyController.start();
            } else if (selection == 4) {
                // handle "Display properties" menu option
                PropertyListController propertyListController = new PropertyListController(main, new PropertyListView());
                propertyListController.displayProperties();
            } else if (selection == 5) {
                // handle "Display tenants" menu option
                TenantListController tenantListController = new TenantListController(main, new TenantListView());
                tenantListController.displayTenants();
            } else if (selection == 6) {
                // handle "Display rented units" menu option
                PropertiesAvailableOrUnavailableController propertiesAvailableOrUnavailableController = new PropertiesAvailableOrUnavailableController(new PropertiesAvailableOrUnavailableView());
                propertiesAvailableOrUnavailableController.displayProperties(Main.properties,false);
            } else if (selection == 7) {
                // handle "Display vacant units" menu option
                PropertiesAvailableOrUnavailableController propertiesAvailableOrUnavailableController = new PropertiesAvailableOrUnavailableController(new PropertiesAvailableOrUnavailableView());
                propertiesAvailableOrUnavailableController.displayProperties(Main.properties,true);
            } else if (selection == 8) {
                // handle "Display all leases" menu option
                DisplayLeaseController leaseController = new DisplayLeaseController(main, new DisplayLeaseView());
                leaseController.displayLeases();
            }  else if (selection == 9) {
                //end lease manually as admin. or end lease when lease date expires
                RefreshLeaseController refreshLeaseController = new RefreshLeaseController(new ResfreshLeaseView());
                refreshLeaseController.refreshLease();
            }else if (selection == 10) {
                DisplayRentLeaseController displayRentLeaseController = new DisplayRentLeaseController(main, new DisplayLeaseView());
                displayRentLeaseController.displayLeases();
            }  else if (selection == 11) {
                // handle "Display unpaid leases" menu option
                RentPaidOrUnpaidController rentPaidOrUnpaidController = new RentPaidOrUnpaidController(new RentPaidOrUnpaidView());
                rentPaidOrUnpaidController.displayPaidOrUnpaidLease(Main.leases,false);
            } else if (selection == 12) {
                // handle "Display paid leases" menu option
                RentPaidOrUnpaidController rentPaidOrUnpaidController = new RentPaidOrUnpaidController(new RentPaidOrUnpaidView());
                rentPaidOrUnpaidController.displayPaidOrUnpaidLease(Main.leases,true);
            }else if (selection == 13) {
                System.out.println("Goodbye!");
            } else {
                view.showError("Invalid selection.");
            }
        }
    }
}

