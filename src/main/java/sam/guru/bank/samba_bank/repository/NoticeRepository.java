package sam.guru.bank.samba_bank.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sam.guru.bank.samba_bank.model.Notice;



@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {

}
