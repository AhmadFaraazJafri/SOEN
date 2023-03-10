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
