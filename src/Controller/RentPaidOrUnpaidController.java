package Controller;

import Model.Lease;
import View.RentPaidOrUnpaidView;

import java.util.List;

public class RentPaidOrUnpaidController {
    private RentPaidOrUnpaidView view;

    public RentPaidOrUnpaidController(RentPaidOrUnpaidView view) {
        this.view = view;
    }

    public void displayPaidOrUnpaidLease(List<Lease> leases, boolean paid) {
        view.displayProperties(leases, paid);
    }
}
