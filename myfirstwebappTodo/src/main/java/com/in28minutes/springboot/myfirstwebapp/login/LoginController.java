package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

//    private AuthenticationService authenticationService;



//    @RequestMapping(value = "login" , method = RequestMethod.GET)
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String goToLoginPage(ModelMap modelMap){
        modelMap.put("name" , "in28minutes");
        return "welcome";
    }

//    public LoginController(AuthenticationService authenticationService) {
//        super();
//        this.authenticationService = authenticationService;
//    }
//
//    @RequestMapping(value = "login" , method = RequestMethod.POST)
//    public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
//        System.out.println(name + " " +password);
//        if(authenticationService.authenticate(name, password)){
//
//            model.put("name" , name);
//            model.put("password" , password);
//
//
//            return "welcome";
//        }
//        return "login";
//    }

}
