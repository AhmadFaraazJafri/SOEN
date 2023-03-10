package View;

import Model.Lease;

import java.util.List;

public class RentPaidOrUnpaidView {

    public void displayProperties(List<Lease> leases, boolean paid) {
        if (leases.isEmpty()) {
            System.out.println("No lease exist in the system.");
        } else {
            if (paid) {
                boolean availablePropertiesExist = false;
                for (Lease lease : leases) {
                    if (lease.isRentPaid()) {
                        availablePropertiesExist = true;
                        System.out.println(lease);
                    }
                }
                if (!availablePropertiesExist) {
                    System.out.println("No lease is paid.");
                }
            }
            else {
                boolean availablePropertiesExist = false;
                for (Lease lease : leases) {
                    if (!lease.isRentPaid()) {
                        availablePropertiesExist = true;
                        System.out.println(lease);
                    }
                }
                if (!availablePropertiesExist) {
                    System.out.println("All leases are paid.");
                }
            }

        }
    }
}
