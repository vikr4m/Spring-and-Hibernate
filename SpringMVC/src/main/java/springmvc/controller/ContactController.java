package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/contact")
	public String showForm() {
		System.out.println("Contact page open");
		return "contact";
	}

	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String processform(@ModelAttribute User user, Model m) {
		System.out.println(user);
		
		if(user.getUsername().isBlank()) {
			return "redirect:/contact";
		}
		if(user.getEmail().isBlank()) {
			return "redirect:/contact";
		}
		if(user.getPassword().isBlank()) {
			return "redirect:/contact";
		}
		
		
		this.userService.createUser(user);
		m.addAttribute("msg","Successfully Registered");
		return "success";
	}
}
