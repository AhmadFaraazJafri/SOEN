package Controller;

import Model.Tenant;
import Model.TenantInterface;
import View.CreateTenantView;

public class CreateTenantController {

    private final CreateTenantView view;

    public CreateTenantController(CreateTenantView view) {
        this.view = view;
    }

    public void createTenant(){
        //create a tenant prototype
        TenantInterface tenantPrototype = new Tenant("Name","name@email.com","0000000000");

        //clone the prototype and set the parameters
        Tenant tenant = tenantPrototype.clone();
        tenant.setName(view.getName());
        tenant.setEmail(view.getEmail());
        tenant.setPhone(view.getPhone());

        //add the tenant to the tenant list
        Main.tenants.add(tenant);
    }
}
