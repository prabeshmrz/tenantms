package mit.prabeshmaharjan.tenantms.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment extends Base {

  public Payment() {
    super();
  }

  public Payment(long id, double dueAmount, Date dueDate, double paidAmount, Tenant tenant) {
    this.id = id;
    this.dueAmount = dueAmount;
    this.dueDate = dueDate;
    this.paidAmount = paidAmount;
    this.tenant = tenant;
  }

  private double dueAmount;

  private Date dueDate;

  private double paidAmount;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "tenant_id", referencedColumnName = "id")
  private Tenant tenant;

  public double getDueAmount() {
    return dueAmount;
  }

  public void setDueAmount(double dueAmount) {
    this.dueAmount = dueAmount;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public double getPaidAmount() {
    return paidAmount;
  }

  public void setPaidAmount(double paidAmount) {
    this.paidAmount = paidAmount;
  }

  public Tenant getTenant() {
    return tenant;
  }

  public void setTenant(Tenant tenant) {
    this.tenant = tenant;
  }
  
}
