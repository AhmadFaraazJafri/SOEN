package Model;

public interface PropertiesSubject {

        void registerTenant(TenantObserver tenant);
        void deregisterTenant(TenantObserver tenant);
        void notifyTenant();

}
