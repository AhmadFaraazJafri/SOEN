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
