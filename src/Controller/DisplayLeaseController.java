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
import Model.Tenant;
import View.DisplayLeaseView;
import View.TenantListView;

import java.util.List;

public class DisplayLeaseController {
    private final Main propertyManager;
    private final DisplayLeaseView displayLeaseView;

    public DisplayLeaseController(Main propertyManager, DisplayLeaseView displayLeaseView) {
        this.propertyManager = propertyManager;
        this.displayLeaseView = displayLeaseView;
    }

    public void displayLeases() {
        List<Lease> leases = Main.leases;
        displayLeaseView.display(leases);
    }
}
