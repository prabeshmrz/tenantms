package mit.prabeshmaharjan.tenantms.service.impl;

import org.springframework.stereotype.Service;

import mit.prabeshmaharjan.tenantms.entity.Transaction;
import mit.prabeshmaharjan.tenantms.repository.TransactionRepository;
import mit.prabeshmaharjan.tenantms.service.TransactionService;

@Service
public class TransactionServiceImpl extends BaseServiceImpl<Transaction> implements TransactionService {

  public TransactionServiceImpl(TransactionRepository repository) {
    super(repository);
  }
  
}
