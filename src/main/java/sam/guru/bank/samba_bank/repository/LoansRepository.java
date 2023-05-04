package sam.guru.bank.samba_bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sam.guru.bank.samba_bank.model.Loans;


@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {
}
