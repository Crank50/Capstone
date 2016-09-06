package capstoneWabedi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Justin on 9/1/16.
 */
@Controller
@RequestMapping(value="/webUi")
public class WebUiController {


    @RequestMapping(value ="/createAccount")
    public String crtAcnnt() {
        return "Users/createAccount";}

    @RequestMapping(value ="/userPage")
    public String userPage() {
        return "WebUi/userPage";}
    }

