package fi.hh.swd20.bookstore2.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id = null;
	private String title;
	private String author;
	private String isbn;
	private Long year;
	private Double price;
	
	@ManyToOne
	@JoinColumn(name = "cid")
	private Category category;
	
	
	public Book() {}
	

	public Book( String title, String author, String isbn, Long year, Double price, Category category) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = year;
		this.price = price;
		this.category = category;
	}

	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getIsbn() {
		return isbn;
	}
	public Long getYear() {
		return year;
	}
	public Double getPrice() {
		return price;
	}
	public Category getCategory() {
		return category;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setYear(Long year) {
		this.year = year;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setCategory(Category category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", year=" + year
				+ ", price=" + price + ", category=" + category + "]";
	}

	
	

}
	
	

