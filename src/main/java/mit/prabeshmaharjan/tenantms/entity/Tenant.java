package mit.prabeshmaharjan.tenantms.entity;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Tenant extends Base {

  public Tenant() {
    super();
  }

  public Tenant(long id, String firstName, String middleName, String lastName, Date dob, Gender gender, String contact, String permanentAddress) {
    this.id = id;
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.dob = dob;
    this.gender = gender;
    this.contact = contact;
    this.permanentAddress = permanentAddress;
  }

  private String firstName;

  private String middleName;

  private String lastName;

  private Date dob;

  private Gender gender;

  private String contact;

  private String permanentAddress;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public String getPermanentAddress() {
    return permanentAddress;
  }

  public void setPermanentAddress(String permanentAddress) {
    this.permanentAddress = permanentAddress;
  }
  
}

enum Gender {
  MALE,
  FEMALE
}
