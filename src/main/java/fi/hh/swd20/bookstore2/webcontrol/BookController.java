package fi.hh.swd20.bookstore2.webcontrol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class BookController {

	
	
	@GetMapping("/index")
public String Book(String title, String author, Long year, String isbn, Double price, Model model) {
		model.addAttribute("title", model);
		model.addAttribute("author", model);
		model.addAttribute("isbn", model);
		model.addAttribute("year", model);
		model.addAttribute("price", model);
		return "welcome";
		
		}
}
