package fi.hh.swd20.bookstore2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import fi.hh.swd20.bookstore2.webcontrol.BookController;
import fi.hh.swd20.bookstore2.webcontrol.CategoryController;
import fi.hh.swd20.bookstore2.webcontrol.UserDetailServiceImpl;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class Bookstore2ApplicationTests {
	
	@Autowired
	private BookController bookController;

	@Test
	void contextLoads() throws Exception {
		 assertThat(bookController).isNotNull(); 
	}
	@Autowired
	private CategoryController categoryController;

	@Test
	void context2Loads() throws Exception {
		 assertThat(categoryController).isNotNull(); 
	}
	@Autowired
	private UserDetailServiceImpl userController;

	@Test
	void context3Loads() throws Exception {
		 assertThat(userController).isNotNull(); 
	}
	
	
	
	
	
	
}

