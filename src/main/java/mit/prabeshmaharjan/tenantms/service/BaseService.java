package mit.prabeshmaharjan.tenantms.service;

import java.util.List;

import mit.prabeshmaharjan.tenantms.entity.Base;

public interface BaseService<E extends Base> {

  List<E> fetchAll();

  E fetchById(long id);

  E create(E entity);

  E update(long id, E entity);

  boolean delete(long id);

}
