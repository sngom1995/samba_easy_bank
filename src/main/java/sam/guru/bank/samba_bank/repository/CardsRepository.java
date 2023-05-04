package sam.guru.bank.samba_bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sam.guru.bank.samba_bank.model.Cards;

import java.util.List;

@Repository
public interface CardsRepository extends CrudRepository<Cards, Long> {

    List<Cards> findByCustomerId(int customerId);
}
