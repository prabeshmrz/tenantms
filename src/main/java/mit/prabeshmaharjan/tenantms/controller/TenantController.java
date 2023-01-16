package mit.prabeshmaharjan.tenantms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mit.prabeshmaharjan.tenantms.entity.Tenant;
import mit.prabeshmaharjan.tenantms.service.TenantService;

@RestController
@RequestMapping(TenantController.BASE_API)
public class TenantController extends BaseController<Tenant> {

  public static final String BASE_API = "/tenant";

  public TenantController(TenantService service) {
    super(service);
  }
  
}
