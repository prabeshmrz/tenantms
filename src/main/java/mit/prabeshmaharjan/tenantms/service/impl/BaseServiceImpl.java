package mit.prabeshmaharjan.tenantms.service.impl;

import java.util.List;

import mit.prabeshmaharjan.tenantms.entity.Base;
import mit.prabeshmaharjan.tenantms.repository.BaseRepository;
import mit.prabeshmaharjan.tenantms.service.BaseService;

public class BaseServiceImpl<E extends Base> implements BaseService<E> {

  private final BaseRepository<E> repository;

  public BaseServiceImpl(BaseRepository<E> repository) {
    this.repository = repository;
  }

  @Override
  public List<E> fetchAll() {
    return repository.findAll();
  }

  @Override
  public E fetchById(long id) {
    return repository.findById(id).orElseThrow(() -> new RuntimeException("Item Not Found :: ID "+id));
  }

  @Override
  public E create(E entity) {
    return repository.save(entity);
  }

  @Override
  public E update(long id, E entity) {
    fetchById(id);
    entity.setId(id);
    return repository.save(entity);
  }

  @Override
  public boolean delete(long id) {
    try {
      fetchById(id);
      repository.deleteById(id);
    } catch (Exception e) {
      return false;
    }
    return true;
  }
  
}
