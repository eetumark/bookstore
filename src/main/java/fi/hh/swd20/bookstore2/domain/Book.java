package fi.hh.swd20.bookstore2.domain;

public class Book {

	
	private String title;
	private String author;
	private String isbn;
	private Long year;
	private Double price;
	
	
	public Book(String title, String author, String isbn, Long year, Double price) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = year;
		this.price = price;
	}
	
	
	
	public Book() {
		super();
		this.title = null;
		this.author = null;
		this.isbn = null;
		this.year = 0L;
		this.price = null;
		
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



	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", year=" + year + ", price=" + price
				+ "]";
	}
	
	
}
