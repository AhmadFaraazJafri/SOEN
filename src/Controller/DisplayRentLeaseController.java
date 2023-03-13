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
import View.DisplayLeaseView;

import java.util.List;

public class DisplayRentLeaseController {
    private final Main propertyManager;
    private final DisplayLeaseView displayLeaseView;

    public DisplayRentLeaseController(Main propertyManager, DisplayLeaseView displayLeaseView) {
        this.propertyManager = propertyManager;
        this.displayLeaseView = displayLeaseView;
    }

    public void displayLeases() {
        int leaseSelection =-1;
        List<Lease> leases = Main.leases;
        displayLeaseView.display(leases);
        if(leases.size()!= 0){
            leaseSelection = displayLeaseView.getSelection(Main.tenants.size());
            boolean value = displayLeaseView.getBooleanValue();
             Main.leases.get(leaseSelection-1).setRentPaid(value);
        }
    }
}
