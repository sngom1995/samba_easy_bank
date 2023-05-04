package sam.guru.bank.samba_bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sam.guru.bank.samba_bank.model.AccountTransactions;

import java.util.List;

@Repository
public interface AccountTransactionRepository extends CrudRepository<AccountTransactions, Long> {

    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int customerId);
}
