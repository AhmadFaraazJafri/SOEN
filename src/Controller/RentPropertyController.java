package Controller;

import Model.ConcretePropertiesSubject;
import Model.Lease;
import Model.PotentialTenant;
import Model.PropertiesSubject;
import Model.TenantObserver;
import View.RentPropertyView;

import java.util.Date;

public class RentPropertyController {
    private final RentPropertyView view;

    public RentPropertyController(RentPropertyView view) {
        this.view = view;
    }

    public void start() {
        int propertySelection = -1;
        int tenantSelection = -1;
        //Rent available property
        view.displayTenants(Main.tenants);
        if (!Main.tenants.isEmpty()) {
            tenantSelection = view.getSelection(Main.tenants.size());
            if (!(tenantSelection > Main.tenants.size())) {
                view.displayProperties(Main.properties);
                if (!Main.properties.isEmpty()) {
                    propertySelection = view.getSelection(Main.properties.size());
                    if (!(propertySelection > Main.properties.size())) {
                        if (Main.properties.get(propertySelection - 1).isAvailable()) {
                            Date startDate = view.inputDate(0);
                            Date endDate = view.inputDate(0);
                            double rentAmount = view.inputRent();
                            Lease lease = new Lease(Main.tenants.get(tenantSelection - 1), Main.properties.get(propertySelection - 1), startDate, endDate, rentAmount);
                            Main.leases.add(lease);
                            Main.tenants.get(tenantSelection - 1).addLease(lease);
                            Main.properties.get(propertySelection - 1).setAvailability(false);
                        } else {
                            //Observer Pattern Implementation
                            view.registeredtoObserver();
                            TenantObserver tenantObserver = new PotentialTenant(Main.tenants.get(tenantSelection - 1).getName(), Main.tenants.get(tenantSelection - 1).getEmail());
                            PropertiesSubject propertiesSubject = new ConcretePropertiesSubject();
                            //Use this line while making the property available?
//                            PropertiesSubject propertiesSubject = new ConcretePropertiesSubject();
                            //propertiesSubject.notifyTenant();
                            propertiesSubject.registerTenant(tenantObserver);
                        }
                    } else {
                        view.displayError();
                    }
                }
            } else {
                view.displayError();
            }
        }
    }
}
