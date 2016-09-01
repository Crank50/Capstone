package capstoneWabedi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Created by Justin on 9/1/16.
 */
public class DefaultController {
    @RequestMapping(value="/")
    public String userConfirmation() {
        return "/userConfirmation/";
    }
}
