package capstoneWabedi.controllers;

import capstoneWabedi.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by Justin on 9/1/16.
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
    private final PasswordEncoder passwordEncoder;
    private final UserDao userDao;
    private final UserRolesDAO userRolesDAO;
    private final AccountTypeDAO accountTypeDAO;

    @Autowired
    ApplicationEventPublisher eventPublisher;



    @Autowired
    public UserController(UserDao userDao, UserRolesDAO userRolesDAO,AccountTypeDAO accountTypeDAO, PasswordEncoder passwordEncoder) {
        Assert.notNull(userDao, "UserDao must not be null!");
        Assert.notNull(userRolesDAO, "UserRolesDao must not be null!");
        Assert.notNull(passwordEncoder, "passwordEncoder must not be null!");
        Assert.notNull(accountTypeDAO,"accountTypeDAO must not be null!");
        this.userDao = userDao;
        this.accountTypeDAO = accountTypeDAO;
        this.userRolesDAO = userRolesDAO;
        this.passwordEncoder = passwordEncoder;
    }


    @RequestMapping(value ="/createAccount")
    public String crtAcnnt(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "/Users/createAccount";}

    @RequestMapping(value ="/userCreation")
    public String svAcnnt(ModelMap modelMap,User user) {
        modelMap.addAttribute("user", user);
        return "/Users/userCreation";}



    @RequestMapping(value="/saveNewUser")
    public String saveNewUser(User user,ModelMap modelMap, String name, String userName, String password,String admin,String email) {
        modelMap.addAttribute("user", user);
        user.setUserId(user.getUserId());
        user.setName(name);
        user.setUserName(userName);
        user.setPassword(passwordEncoder.encode(password));
        user.setEmail(email);
        user.setEnabled(1);
        user.setAdmin(admin);
//        account.setCreated(new java.sql.Timestamp(System.currentTimeMillis()));
        userDao.save(user);
//        ,AccountType.TYPE accountType
//        UserRole userRole = new UserRole();
//        userRole.setUserId(user.getUserId());
//        if(accountType == AccountType.TYPE.SYSTEM_ADMIN){
//            userRole.setRole("SYSTEM_ADMIN");
//        } else {
//            userRole.setRole("ACCOUNT_ADMIN");
//        }
//        userRolesDAO.save(userRole);

        return "/Users/userAccountPage";
    }
    @RequestMapping(value="/adminPage")
    public String adminPage() {


        return "/Users/adminPage";
    }
    @RequestMapping(value="/userAccountPage")
    public String userAccountPage(AccountType accountType,String username, ModelMap modelMap) {
        modelMap.addAttribute("accountType", accountType);
        System.out.println(username);
        System.out.println("directs to /useraccountPage methodology");
        return "/Users/userAccountPage";
    }
//    private void addUploadToDatabase(String filePath) {
//        try {
//            Path newUserUploadedFilePath = Paths.get(filePath);
//            ObjectMapper mapper = new ObjectMapper();
//            List<User> uploadedNewUsers = mapper.readValue(Files.newInputStream(newUserUploadedFilePath), new TypeReference<List<User>>(){});
//            for(User uploadedUsers : uploadedNewUsers) {
//                User user = new User();
//                user.setName(uploadedUsers.getName());
//                user.setCity(uploadedUsers.getCity());
//                user.setStates(uploadedUsers.getStates());
//                user.setZip(uploadedUsers.getZip());
//                user.setEmail(uploadedUsers.getEmail());
//                user.setPhone(uploadedUsers.getPhone());
//                user.setSsn(uploadedUsers.getSsn());
//                user.setAdmin(uploadedUsers.getAdmin());
//                userDao.save(user);
//            }
//        } catch (IOException ioe) {
//            System.out.println("Issue reading List from JSON file");
//            ioe.printStackTrace();
//        }
//    }
}
