package capstoneWabedi.controllers;

import capstoneWabedi.entities.User;
import capstoneWabedi.entities.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Justin on 9/1/16.
 */
@Controller
@RequestMapping(value="/admin")
public class AdminController {

    private final UserDao userDao;

    @Autowired
    public AdminController(UserDao userDao) {
        Assert.notNull(userDao, "UserDao must not be null!");
        this.userDao = userDao;
    }

    @RequestMapping(value = "/")
    public String allUsers(ModelMap modelMap){
        Iterable<User> users = userDao.findAll();
        modelMap.addAttribute("users", users);
        return "Users/adminPage";
    }
    @RequestMapping(value = "/uploadBills")
    public String uploadBills(){

        return "Users/addBills";
    }


}
