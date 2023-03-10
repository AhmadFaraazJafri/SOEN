package View;

import Model.Lease;
import Model.Tenant;

import java.util.List;
import java.util.Scanner;

public class DisplayLeaseView {
    public void display(List<Lease> leases) {
        if (leases.isEmpty()) {
            System.out.println("No lease found.");
        } else {
            int number = 1;
            for (Lease lease : leases) {
                System.out.println(number++ + ". " + lease.toString());
            }
        }
    }

    public int getSelection(int size) {
        int range = size;
        Scanner scanner = new Scanner(System.in);
        int selection = -1;
        while (selection < 1) {
            System.out.print("Enter your selection: ");
            if (scanner.hasNextInt()) {
                selection = scanner.nextInt();
                if (selection > range + 1) {
                    break;
                }
            } else {
                scanner.next(); // consume the invalid input
            }
        }
        return selection;
    }

    public boolean getBooleanValue() {
        System.out.println("1. Paid");
        System.out.println("2. UnPaid");
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        scanner.nextLine();
        if (val == 1){
            return true;
        }
        else {
            return false;
        }
    }
}
