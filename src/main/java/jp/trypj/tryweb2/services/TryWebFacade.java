package jp.trypj.tryweb2.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import jp.trypj.tryweb2.entities.*;

@Stateless
public class TryWebFacade {

	@PersistenceContext(unitName = "tryweb2")
	private EntityManager em;
	
	public void create(Author author) {
		em.persist(author);
	}
	
	public void create(Book book) {
		em.persist(book);
	}
	
	public List<Author> getAllAuthors() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Author> query = cb.createQuery(Author.class);
		return em.createQuery(query).getResultList();
	}
	
	public List<Book> getAllBooks() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Book> query = cb.createQuery(Book.class);
		return em.createQuery(query).getResultList();
	}
	
	
	
}
