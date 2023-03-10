package Controller;

import Model.Lease;
import View.DisplayLeaseView;

import java.util.List;

public class DisplayRentLeaseController {
    private Main propertyManager;
    private DisplayLeaseView displayLeaseView;

    public DisplayRentLeaseController(Main propertyManager, DisplayLeaseView displayLeaseView) {
        this.propertyManager = propertyManager;
        this.displayLeaseView = displayLeaseView;
    }

    public void displayLeases() {
        int leaseSelection =-1;
        List<Lease> leases = Main.leases;
        displayLeaseView.display(leases);
        leaseSelection = displayLeaseView.getSelection(Main.tenants.size());
        boolean value = displayLeaseView.getBooleanValue();
        Main.leases.get(leaseSelection-1).setRentPaid(value);
    }
}
