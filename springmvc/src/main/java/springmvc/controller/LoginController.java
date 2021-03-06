package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public ModelAndView submit(@ModelAttribute("user") User user){
    	if( user.getUserName().equals("user") && user.getPassword().equals("pass")){
            ModelAndView modelAndView =  new ModelAndView("loggedin");
            return modelAndView;
        }
        ModelAndView modelAndView =  new ModelAndView("error");
        return modelAndView;

    }
}
