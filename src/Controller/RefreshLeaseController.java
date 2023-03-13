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

import Model.RefreshLease;
import Model.Tenant;
import Model.TenantInterface;
import View.CreateTenantView;
import View.ResfreshLeaseView;

import java.util.Date;

public class RefreshLeaseController {

    private final ResfreshLeaseView view;

    public RefreshLeaseController(ResfreshLeaseView view) {
        this.view = view;
    }

    public void refreshLease() {

        Date date =view.getDate();
        RefreshLease refresh= new RefreshLease();
        refresh.refresh(Main.leases,date);

    }
}
