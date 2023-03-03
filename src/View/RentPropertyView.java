package View;

import Controller.Main;
import Model.Property;
import Model.Tenant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class RentPropertyView {

    public void displayProperties(List<Property> properties) {
        if (properties.isEmpty()) {
            System.out.println("No properties found.");
        } else {
            int number = 1;
            for (Property property : properties) {
                System.out.println(number++ + ". " + property.toString());
            }
            System.out.println(number + ". " + "Exit");
        }
    }

    public void displayTenants(List<Tenant> tenants) {
        if (tenants.isEmpty()) {
            System.out.println("No tenant found.");
        } else {
            int number = 1;
            for (Tenant tenant : tenants) {
                System.out.println(number++ + ". " + tenant.toString());
            }
            System.out.println(number + ". " + "Exit");
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

    public void displayError() {
        System.out.println("Choose the correct option.");
    }

    public Date inputDate(int check) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
        if (check == 0) {
            System.out.println("Enter lease start date in MM-dd-yyyy format");
        } else if (check == 1) {
            System.out.println("Enter lease end date in MM-dd-yyyy format");
        }
        Scanner scanner = new Scanner(System.in);
        String stringDate = scanner.nextLine();
        Date date = null;
        try {
            date = dateFormat.parse(stringDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return date;
    }

    public double inputRent() {
        System.out.println("Enter Rent Amount");
        Scanner scanner = new Scanner(System.in);
        double rentAmount = scanner.nextDouble();
        scanner.nextLine();
        return rentAmount;
    }

    public void registeredtoObserver() {
        System.out.println("The unit you are interested in is occupied right now. You will be notified when the unit is available.");
    }
}
