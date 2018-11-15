package jp.trypj.tryweb2.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BOOKS database table.
 * 
 */
@Entity
@Table(name="BOOKS")
@NamedQuery(name="Book.findAll", query="SELECT b FROM Book b")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BOOKS_ID_GENERATOR", sequenceName="BOK_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BOOKS_ID_GENERATOR")
	private Integer id;

	private String name;

	private String note;

	private Integer price;

	//bi-directional many-to-one association to Author
	@ManyToOne
	private Author author;

	public Book() {
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

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Author getAuthor() {
		return this.author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

}