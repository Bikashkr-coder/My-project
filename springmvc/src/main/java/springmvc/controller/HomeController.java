package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.interest;

@Controller
public class HomeController {
	
	@RequestMapping("/intrest")
	public String intrest() {
		return "interest";
	}
	
	@RequestMapping(path="/proccessForm",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute interest interest,Model model) {
		System.out.println("gvbkj");
		//model.addAttribute("name",name);
		
		return "simpleInterest";
	}

	@RequestMapping("/interest")
	public ModelAndView interest() {
		System.out.println("view index.jsp");
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("amount", 2000 );
		modelAndView.addObject("principle", 500);
		modelAndView.setViewName("simpleInterest");
		return modelAndView;
	}
	
}
