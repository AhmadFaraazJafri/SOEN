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
package View;


import Model.Address;

import java.util.Scanner;

public class CreatePropertyView {
    public String getStreetNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter street number: ");
        return scanner.nextLine();
    }

    public Address getAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter street name: ");
        String streetName = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter state: ");
        String state = scanner.nextLine();
        System.out.print("Enter zip code: ");
        String zipCode = scanner.nextLine();
        return new Address(streetName, city, state, zipCode);
    }

    public int getUnitNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter unit/apartment number: ");
        return scanner.nextInt();
    }

    public int getNumberOfBedrooms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of bedrooms: ");
        return scanner.nextInt();
    }

    public int getNumberOfBathrooms() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of bathrooms: ");
        return scanner.nextInt();
    }

    public int getSquareFootage() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter square footage: ");
        return scanner.nextInt();
    }
}
