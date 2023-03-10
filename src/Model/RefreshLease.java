package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RefreshLease {
    public void refresh(List<Lease> leases, Date date) {
        Iterator<Lease> iterator = leases.iterator();
        while (iterator.hasNext()) {
            Lease lease = iterator.next();
            if (lease.getEndDate().before(date)) {
                lease.getProperty().setAvailability(true);
                lease.getTenant().setLeases(new ArrayList<Lease>());
                iterator.remove();
            }
        }
    }
}
