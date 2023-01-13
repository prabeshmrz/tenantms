package mit.prabeshmaharjan.tenantms.service.impl;

import org.springframework.stereotype.Service;

import mit.prabeshmaharjan.tenantms.entity.Tenant;
import mit.prabeshmaharjan.tenantms.repository.TenantRepository;
import mit.prabeshmaharjan.tenantms.service.TenantService;

@Service
public class TenantServiceImpl extends BaseServiceImpl<Tenant> implements TenantService {

  public TenantServiceImpl(TenantRepository repository) {
    super(repository);
  }
  
}
