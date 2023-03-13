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

import java.util.Scanner;

public class CreateTenantView {

    Scanner scanner = new Scanner(System.in);

    public String getName() {
        System.out.println("Enter the tenant Name : ");
        return scanner.nextLine();
    }

    public String getEmail() {
        System.out.println("Enter the tenant Email : ");
        return scanner.nextLine();
    }

    public String getPhone() {
        System.out.println("Enter the tenant Phone : ");
        return scanner.nextLine();
    }

}
