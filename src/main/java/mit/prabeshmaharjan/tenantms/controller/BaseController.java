package mit.prabeshmaharjan.tenantms.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import mit.prabeshmaharjan.tenantms.entity.Base;
import mit.prabeshmaharjan.tenantms.service.BaseService;

public class BaseController<E extends Base> {

  public static final String BASE_API = "";

  private final BaseService<E> service;

  public BaseController(BaseService<E> service) {
    this.service = service;
  }

  @GetMapping
  public ResponseEntity<List<E>> fetchAll() {
    return ResponseEntity.ok(service.fetchAll());
  }

  @GetMapping("{id}")
  public ResponseEntity<E> fetchById(@PathVariable(value = "id", required = true) long id) {
    return ResponseEntity.ok(service.fetchById(id));
  }

  @PostMapping
  public ResponseEntity<E> create(@RequestBody E entity) {
    return new ResponseEntity<E>(service.create(entity) , HttpStatus.CREATED);
  }

  @PutMapping("{id}")
  public ResponseEntity<E> update(@PathVariable(value = "id", required = true) long id, @RequestBody E entity) {
    return ResponseEntity.ok(service.update(id, entity));
  }

  @DeleteMapping("{id}")
  public ResponseEntity<?> delete(@PathVariable(value = "id", required = true) long id) {
    service.delete(id);
    return ResponseEntity.ok().build();
  }
  
}
