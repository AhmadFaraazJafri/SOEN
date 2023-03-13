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
import View.RentPaidOrUnpaidView;

import java.util.List;

public class RentPaidOrUnpaidController {
    private final RentPaidOrUnpaidView view;

    public RentPaidOrUnpaidController(RentPaidOrUnpaidView view) {
        this.view = view;
    }

    public void displayPaidOrUnpaidLease(List<Lease> leases, boolean paid) {
        view.displayProperties(leases, paid);
    }
}
