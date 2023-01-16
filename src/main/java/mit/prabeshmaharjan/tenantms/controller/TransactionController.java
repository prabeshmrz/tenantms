package mit.prabeshmaharjan.tenantms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mit.prabeshmaharjan.tenantms.entity.Transaction;
import mit.prabeshmaharjan.tenantms.service.TransactionService;

@RestController
@RequestMapping(TransactionController.BASE_API)
public class TransactionController extends BaseController<Transaction> {

  public static final String BASE_API = "/transaction";

  public TransactionController(TransactionService service) {
    super(service);
  }
  
}
