package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Vikram singh jadav");
		model.addAttribute("id",101);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Mukul");
		friends.add("Shivam");
		friends.add("Devanand");
		model.addAttribute("f", friends);
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is About page");
		
		return "about";
	}
	
	@RequestMapping("/services")
	public String services() {
		System.out.println("This is Services page");
		return "services";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is Help page");
		//creating ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		//setting rollno
		modelAndView.addObject("rollno", 1234);
		
		//date and time
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		now.toString();
		
		//setting the name
		modelAndView.addObject("name", "Paglet");
		
		//setting the view name
		modelAndView.setViewName("help");
		
		//marks
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(23);
		marks.add(12);
		marks.add(65);
		marks.add(87);
		marks.add(74);
		modelAndView.addObject("marks",marks);
		
		return modelAndView;
	}
	
}
