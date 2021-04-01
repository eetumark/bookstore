package fi.hh.swd20.bookstore2;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import fi.hh.swd20.bookstore2.domain.Book;
import fi.hh.swd20.bookstore2.domain.BookRepository;
import fi.hh.swd20.bookstore2.domain.Category;
import fi.hh.swd20.bookstore2.domain.CategoryRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookstoreRepositoryTest {

	@Autowired
	private BookRepository repository;
	
	@Test
	public void findByTitleShouldReturnBook( ) {
		List<Book> books = repository.findByTitle("The Hobbit");
		assertThat(books).hasSize(1);
		assertThat(books.get(0).getIsbn()).isEqualTo("493204");
	}
	@Test
	public void createNewBook() {
		Book book = new Book("Aapinen", "Mikael Agricola", "529896", (long) 1954, 15.0, new Category("Education"));
		repository.save(book);
		assertThat(book.getId()).isNotNull();
	}
	
	@Autowired
	private CategoryRepository repository2;
	
	@Test
	public void findByNameShouldReturnCategory( ) {
		List<Category> categories = repository2.findByName("Fantasy");
		assertThat(categories).hasSize(1);
		assertThat(categories.get(0).getName()).isEqualTo("Fantasy");
	}
	@Test
	public void createNewCategory() {
		Category category = new Category("Romance");
		repository2.save(category);
		assertThat(category.getId()).isNotNull();
	}
	
}
