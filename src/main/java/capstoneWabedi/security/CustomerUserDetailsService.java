package capstoneWabedi.security;

import capstoneWabedi.entities.User;
import capstoneWabedi.entities.UserDao;
import capstoneWabedi.entities.UserRolesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Justin on 9/13/16.
 */
@Service("customerUserDetailsService")
public class CustomerUserDetailsService implements UserDetailsService {

    private final UserDao userDao;
    private final UserRolesDAO userRolesDAO;

    @Autowired
    public CustomerUserDetailsService(UserDao userDao, UserRolesDAO userRolesDAO) {
        this.userDao = userDao;
        this.userRolesDAO = userRolesDAO;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= userDao.findByUserName(username);
        if(null == user){
            throw new UsernameNotFoundException("No user present with username: "+username);
        }else{
            List<String> userRoles= userRolesDAO.findRoleByUserName(username);
            return new CustomerUserDetails(user,userRoles);
        }
    }
}
