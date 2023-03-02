package Controller;

import Model.Lease;
import Model.Tenant;
import View.DisplayLeaseView;
import View.TenantListView;

import java.util.List;

public class DisplayLeaseController {
    private Main propertyManager;
    private DisplayLeaseView displayLeaseView;

    public DisplayLeaseController(Main propertyManager, DisplayLeaseView displayLeaseView) {
        this.propertyManager = propertyManager;
        this.displayLeaseView = displayLeaseView;
    }

    public void displayLeases() {
        List<Lease> leases = Main.leases;
        displayLeaseView.display(leases);
    }
}
