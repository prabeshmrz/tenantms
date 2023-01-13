package mit.prabeshmaharjan.tenantms.service.impl;

import org.springframework.stereotype.Service;

import mit.prabeshmaharjan.tenantms.entity.Payment;
import mit.prabeshmaharjan.tenantms.repository.PaymentRepository;
import mit.prabeshmaharjan.tenantms.service.PaymentService;

@Service
public class PaymentServiceImpl extends BaseServiceImpl<Payment> implements PaymentService {

  public PaymentServiceImpl(PaymentRepository repository) {
    super(repository);
  }
  
}
