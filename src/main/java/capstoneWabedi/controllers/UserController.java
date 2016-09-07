package capstoneWabedi.controllers;

import capstoneWabedi.entities.User;
import capstoneWabedi.entities.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by Justin on 9/1/16.
 */
@Controller
@RequestMapping(value="/user/")
public class UserController {

    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        Assert.notNull(userDao, "UserDao must not be null!");
        this.userDao = userDao;
    }
    @RequestMapping(value="/")
    public String allUsers(ModelMap model) {
        Iterable<User> users = userDao.findAll();
        model.addAttribute("users",users);
        return "WebUi/mainPage";
    }

    @RequestMapping(value="saveNewUser")
    public View saveNewQuestion(User user) {
        userDao.save(user);
        return new RedirectView("/user/");
    }
}
