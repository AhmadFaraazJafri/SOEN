package Model;

import java.util.ArrayList;
import java.util.List;

public class Tenant implements TenantInterface {
    private String name;
    private String email;
    private String phone;
    private List<Lease> leases;

    public Tenant(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.leases = new ArrayList<>();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Tenant clone() {
        return new Tenant(name, email, phone);
    }

    public void addLease(Lease lease) {
        leases.add(lease);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLeases() {
        StringBuilder sb = new StringBuilder();
        for (Lease lease : leases) {
            sb.append("\nLease:\n")
                    .append("Start date: ").append(lease.getStartDate()).append("\n")
                    .append("End date: ").append(lease.getEndDate()).append("\n")
                    .append("Property address: ").append(lease.getProperty().getAddress()).append("\n")
                    .append("Rent amount: ").append(lease.getRentAmount()).append("\n")
                    .append("Rent paid: ").append(lease.isRentPaid()).append("\n");
        }
        return sb.toString();
    }


    public void setLeases(List<Lease> leases) {
        this.leases = leases;
    }

    @Override
    public String toString() {
        String leases = getLeases();
        return "Tenant{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                leases +
                '}';
    }
}
