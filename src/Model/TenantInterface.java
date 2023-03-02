package Model;

public interface TenantInterface extends Cloneable {
    public void addLease(Lease lease);

    public Tenant clone();

    public String toString();
}
