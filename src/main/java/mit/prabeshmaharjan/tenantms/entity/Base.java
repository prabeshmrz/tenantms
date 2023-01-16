package mit.prabeshmaharjan.tenantms.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Base {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected long id;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
  
}
