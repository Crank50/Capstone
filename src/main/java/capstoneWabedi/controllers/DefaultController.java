package capstoneWabedi.controllers;

import capstoneWabedi.entities.AccountType;
import capstoneWabedi.entities.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Justin on 9/1/16.
 */
@Controller
public class DefaultController {

    @RequestMapping(value="/")
    public String jspIndex() {
        return "WebUi/mainPage";
    }


    @RequestMapping(value="/login")
    public String login(ModelMap modelMap, String username) {
        modelMap.addAttribute("accountType", new AccountType());
        System.out.println(username);
        System.out.println("action to the /login method");
        return "login";
    }

    @RequestMapping(value="/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        request.setAttribute("logout","logout");
        return "login";
    }
}

