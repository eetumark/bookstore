package fi.hh.swd20.bookstore2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.hh.swd20.bookstore2.domain.Book;
import fi.hh.swd20.bookstore2.domain.BookRepository;
import fi.hh.swd20.bookstore2.domain.Category;
import fi.hh.swd20.bookstore2.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository, CategoryRepository repository2) {
		log.info("save a few books");
		return (args) -> {
			
			
			
			Category c1 = new Category("Fantasy");
			repository2.save(c1);
			Category c2 = new Category("Mystery");
			repository2.save(c2);
			Category c3 = new Category("Horror");
			repository2.save(c3);
			repository.save(new Book("The Hobbit", "J.R.R. Tolkien", "493204", 1937L, 50.0, repository2.findByName("Fantasy").get(0)));
			repository.save(new Book("Harry Potter and The Chamber of Secrets", "J.K. Rowling", "932710", 1998L, 45.0, repository2.findByName("Horror").get(0)));
		
			
		log.info("fetch all books");
		for (Book book : repository.findAll()) {
			log.info(book.toString());
		}
		
		};
		
	}

	};
	
	

