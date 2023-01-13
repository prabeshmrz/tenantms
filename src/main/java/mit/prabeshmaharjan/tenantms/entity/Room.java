package mit.prabeshmaharjan.tenantms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
public class Room extends Base {

  public Room() {
    super();
  }

  public Room(long id, int floorNumber, int roomNumber, double rate, Tenant currentTenant) {
    this.id = id;
    this.floorNumber = floorNumber;
    this.roomNumber = roomNumber;
    this.rate = rate;
    this.currentTenant = currentTenant;
  }

  private int floorNumber;

  private int roomNumber;

  private double rate;

  @OneToOne(optional = true)
  private Tenant currentTenant;

  public int getFloorNumber() {
    return floorNumber;
  }

  public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Tenant getCurrentTenant() {
    return currentTenant;
  }

  public void setCurrentTenant(Tenant currentTenant) {
    this.currentTenant = currentTenant;
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

}
