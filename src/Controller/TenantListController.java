package Controller;

import Model.Tenant;
import View.TenantListView;

import java.util.List;

public class TenantListController {
    private Main propertyManager;
    private TenantListView tenantListView;

    public TenantListController(Main propertyManager, TenantListView tenantListView) {
        this.propertyManager = propertyManager;
        this.tenantListView = tenantListView;
    }

    public void displayTenants() {
        List<Tenant> tenants = Main.tenants;
        tenantListView.display(tenants);
    }
}
