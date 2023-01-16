package mit.prabeshmaharjan.tenantms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mit.prabeshmaharjan.tenantms.entity.Payment;
import mit.prabeshmaharjan.tenantms.service.PaymentService;

@RestController
@RequestMapping(PaymentController.BASE_API)
public class PaymentController extends BaseController<Payment> {

  public static final String BASE_API = "/payment";

  public PaymentController(PaymentService service) {
    super(service);
  }
  
}
