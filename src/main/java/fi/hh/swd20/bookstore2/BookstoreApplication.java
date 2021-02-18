package fi.hh.swd20.bookstore2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.hh.swd20.bookstore2.domain.Book;
import fi.hh.swd20.bookstore2.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository repository) {
		log.info("save a few books");
		return (args) -> {
			Book f1 = new Book("The Hobbit", "J.R.R. Tolkien", "kaivinkone", 1979L, 30.0);
			Book f2 = new Book("Lya ei ikinä jää", "Aitio", "vtcht", 2021L, 50.0);
			repository.save(f1);
			repository.save(f2);
			
		log.info("fetch all books");
		for (Book book : repository.findAll()) {
			log.info(book.toString());
		}
		
		};
	}
	
	
	
}
