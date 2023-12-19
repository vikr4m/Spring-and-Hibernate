package springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FormController {
	@RequestMapping("/complex")
	public String showform() {
		return "complexform";
	}
	
	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formhandle(@ModelAttribute("student") Student student,BindingResult result) {
		
		if(result.hasErrors()) {
			return "complexform";
		}
		
		System.out.println(student);
		return "success";
		
		
	}
}
