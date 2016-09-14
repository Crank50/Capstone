package capstoneWabedi.entities;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Justin on 9/13/16.
 */
@Repository

public interface UserRolesDAO extends CrudRepository<UserRole, Long>{

    @Query("select a.role from UserRole a, User b where b.userName=?1 and a.userId=b.userId")
    public List<String> findRoleByUserName(String username);
}
