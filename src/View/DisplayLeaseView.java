package View;

import Model.Lease;
import Model.Tenant;

import java.util.List;

public class DisplayLeaseView {
    public void display(List<Lease> leases) {
        if (leases.isEmpty()) {
            System.out.println("No lease found.");
        } else {
            for (Lease lease : leases) {
                System.out.println(lease.toString());
            }
        }
    }
}
