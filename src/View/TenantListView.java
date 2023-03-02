package View;

import Model.Tenant;

import java.util.List;

public class TenantListView {
    public void display(List<Tenant> tenants) {
        if (tenants.isEmpty()) {
            System.out.println("No tenants found.");
        } else {
            for (Tenant tenant : tenants) {
                System.out.println(tenant.toString());
            }
        }
    }
}
