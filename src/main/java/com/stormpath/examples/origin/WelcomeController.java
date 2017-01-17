package com.stormpath.examples.origin;

import com.stormpath.juiser.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @Autowired
    private User user;

    @RequestMapping("/")
    public String welcome(Model model) {

        model.addAttribute("user", user);

        return "welcome";
    }
}
