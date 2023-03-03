package Model;

import java.util.ArrayList;
import java.util.List;

public class ConcretePropertiesSubject implements PropertiesSubject{
    static List<TenantObserver> tenantObservers = new ArrayList<>();
    private boolean isAvailable;

    public ConcretePropertiesSubject(){
        isAvailable = false;
    }
    @Override
    public void registerTenant(TenantObserver tenant) {
            tenantObservers.add(tenant);
    }

    @Override
    public void deregisterTenant(TenantObserver tenant) {
            tenantObservers.remove(tenant);
    }
    public boolean isAvailableUnit(){
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable){
        this.isAvailable=isAvailable;
        if (isAvailable == true)
            notifyTenant();
    }
    @Override
    public void notifyTenant() {

        for(TenantObserver tenant:tenantObservers){
            tenant.update();
        }

    }
}
