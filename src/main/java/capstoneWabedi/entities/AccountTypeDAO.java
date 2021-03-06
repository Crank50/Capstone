package capstoneWabedi.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Justin on 9/1/16.
 */
@Transactional
public interface AccountTypeDAO extends CrudRepository<AccountType, Long> {
}
