/**
 * @author Copyright (c) 2008,2013, Oracle and/or its affiliates. All rights reserved.
 *  
 */
package jp.trypj.tryweb2.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import jp.trypj.tryweb2.entities.Author;
import jp.trypj.tryweb2.services.TryWebFacade;

import java.util.List;

/**
 * CDI Managed Bean Class
 */
@Named
@RequestScoped
public class TryWebBean {

	private List<Author> authors;

	private String name = "ABCDEZ";

	@Inject
	private TryWebFacade facade;
	
	@PostConstruct
	public void init() {
		authors = facade.getAllAuthors();
		System.out.println("PostConstruct END");
	}
	
	
	
	
	public List<Author> getAuthors() {
		return authors;
	}




	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}




	public String getHello() {
		return "Hello BeanProperty";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
