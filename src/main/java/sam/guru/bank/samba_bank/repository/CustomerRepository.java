package sam.guru.bank.samba_bank.repository;

import org.springframework.data.repository.CrudRepository;
import sam.guru.bank.samba_bank.model.Customer;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByEmail(String email);
}
