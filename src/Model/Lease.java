package Model;

import java.util.Date;

public class Lease {
    private Tenant tenant;
    private Property property;
    private Date startDate;
    private Date endDate;
    private double rentAmount;
    private boolean rentPaid;

    public Lease(Tenant tenant, Property property, Date startDate, Date endDate, double rentAmount) {
        this.tenant = tenant;
        this.property = property;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rentAmount = rentAmount;
        this.rentPaid = false;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public boolean isRentPaid() {
        return rentPaid;
    }

    public void setRentPaid(boolean rentPaid) {
        this.rentPaid = rentPaid;
    }

    @Override
    public String toString() {
        return tenant + "\n" +
                ", Property Details=" + property +
                '}';
    }
}
