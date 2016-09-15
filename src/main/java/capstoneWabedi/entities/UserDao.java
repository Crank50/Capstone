package capstoneWabedi.entities;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Justin on 9/1/16.
 */
@Repository
@Transactional (noRollbackFor = Exception.class)
public interface UserDao extends CrudRepository<User, Long> {

    public User findByUserName(String username);

}
