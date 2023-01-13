package mit.prabeshmaharjan.tenantms.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction extends Base {

  public Transaction() {
    super();
  }

  public Transaction(long id, double amount, TransactionType type, Date date, Tenant tenant) {
    this.id = id;
    this.amount = amount;
    this.type = type;
    this.date = date;
    this.tenant = tenant;
  }

  private double amount;

  private TransactionType type;

  private Date date;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "tenant_id", referencedColumnName = "id")
  private Tenant tenant;

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public TransactionType getType() {
    return type;
  }

  public void setType(TransactionType type) {
    this.type = type;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Tenant getTenant() {
    return tenant;
  }

  public void setTenant(Tenant tenant) {
    this.tenant = tenant;
  }
  
}

enum TransactionType {
  DUE,
  PAID
}
