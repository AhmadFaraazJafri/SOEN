import java.util.ArrayList;
import java.util.List;

public class Tenant {
    private String name;
    private String email;
    private List<Lease> leases;

    public Tenant(String name, String email) {
        this.name = name;
        this.email = email;
        this.leases = new ArrayList<>();
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

    public List<Lease> getLeases() {
        return leases;
    }

    public void setLeases(List<Lease> leases) {
        this.leases = leases;
    }
}
