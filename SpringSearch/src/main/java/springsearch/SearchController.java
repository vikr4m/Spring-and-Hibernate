package springsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	@RequestMapping("/search")
	public String search() {
		return "search";
	}
	
	@RequestMapping("finder")
	public String finder(@RequestParam("querybox") String query) {
		String url="";
		if(query.isBlank()) {
			url = "/search";
		}
		else {
			url = "https://www.google.com/search?q=" + query;
		}
		
		return "redirect:"+url;
		
		
	}
}
