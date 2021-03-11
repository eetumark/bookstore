package fi.hh.swd20.bookstore2.webcontrol;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.hh.swd20.bookstore2.domain.Book;
import fi.hh.swd20.bookstore2.domain.BookRepository;
import fi.hh.swd20.bookstore2.domain.CategoryRepository;



@Controller
public class BookController {
	private final AtomicLong counter = new AtomicLong();
	
	
	
	@Autowired
	private BookRepository repository;
	@Autowired
	private CategoryRepository repository2;
	
	@RequestMapping(value= {"/", "/booklist"})
	public String bookList(Model model) {
				model.addAttribute("books", repository.findAll());
				return "booklist";
	}
	
	@RequestMapping(value= "/books", method = RequestMethod.GET)
	public @ResponseBody List<Book> bookListRest(){
				return (List<Book>) repository.findAll();
	}
	
	@RequestMapping(value= "/books/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Book> findBookRest(@PathVariable("id") Long id){
		return repository.findById(id);
				
	}
	
	
	@RequestMapping(value= "/add")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("categories", repository2.findAll());
		return "addbook";
		
	}
	@PostMapping("/save")
	public String save(Book book) {
		repository.save(book);
		return "redirect:booklist";
		
	}
	@RequestMapping(value="/edit/{id}")
	public String addBook(@PathVariable("id") Long id, Model model) {
		model.addAttribute("book", repository.findById(id));
		return "editbook";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteBook(@PathVariable("id") Long id, Model model) {
		repository.deleteById(id);
		return "redirect:../booklist";
		}
		


}
	
	

