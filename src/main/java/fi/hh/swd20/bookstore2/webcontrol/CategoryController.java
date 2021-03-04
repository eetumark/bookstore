package fi.hh.swd20.bookstore2.webcontrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fi.hh.swd20.bookstore2.domain.Category;
import fi.hh.swd20.bookstore2.domain.CategoryRepository;

@Controller
public class CategoryController {

	@Autowired
	private CategoryRepository repository2;
	
	@RequestMapping(value= "/category")
	public String categoryList(Model model) {
		model.addAttribute("categories", repository2.findAll());
		return "categorylist";
	}
	
	@RequestMapping(value= "/addcategory")
	public String addCategory(Model model) {
		model.addAttribute("category", new Category());
		return "addcategory";
		
	}
	@PostMapping("/savecategory")
	public String saveCategory(Category category) {
		repository2.save(category);
		return "redirect:category";
		
	}
	@RequestMapping(value="/editcategory/{id}")
	public String addCategory(@PathVariable("id") Long id, Model model) {
		model.addAttribute("category", repository2.findById(id));
		return "editcategory";
	}
	
	@GetMapping("/deletecategory/{id}")
	public String deleteCategory(@PathVariable("id") Long id, Model model) {
		repository2.deleteById(id);
		return "redirect:../category";
		}
		
}
