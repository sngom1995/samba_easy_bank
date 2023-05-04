package sam.guru.bank.samba_bank.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sam.guru.bank.samba_bank.model.Accounts;

@Repository
public interface AccountRepository extends CrudRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);
}
