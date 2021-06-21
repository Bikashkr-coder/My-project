package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SinmpleInterest {

	@RequestMapping("/interestAmount")
	public String interestForm() {
		return "interestAmount";
	}
	@RequestMapping(path = "/processForm",method = RequestMethod.POST )
	public String processform(@ModelAttribute interestAmount interest,Model model) {
		System.out.println("sacdac");
		interestAmount ia=new interestAmount();
		float amt=(ia.getRate()*ia.getAmount()*ia.getYears())%100;
		model.addAttribute(amt);
		return "success";
	}
	
	
	
}
