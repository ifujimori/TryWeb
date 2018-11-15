package jp.trypj.tryweb2.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the AUTHORS database table.
 * 
 */
@Entity
@Table(name="AUTHORS")
@NamedQuery(name="Author.findAll", query="SELECT a FROM Author a")
public class Author implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="AUTHORS_ID_GENERATOR", sequenceName="ATH_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AUTHORS_ID_GENERATOR")
	private Integer id;

	private String name;

	//bi-directional many-to-one association to Book
	@OneToMany(mappedBy="author")
	private List<Book> books;

	public Author() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return this.books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Book addBook(Book book) {
		getBooks().add(book);
		book.setAuthor(this);

		return book;
	}

	public Book removeBook(Book book) {
		getBooks().remove(book);
		book.setAuthor(null);

		return book;
	}

}