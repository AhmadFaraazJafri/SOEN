/***
 * ............................................................
 *    Project Phase 1 , SOEN 6441
 *    ©(Faraaz, Himangshu, Shivesh)
 *    Written by:
 *                @author Himangshu Shekhar Baruah , Student ID 40229774
 *                @author Ahmad Faraaz Jafri, Student ID 40232742
 *                @author Shivesh Chaudhary, Student ID 40228107
 * ............................................................
 */
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
