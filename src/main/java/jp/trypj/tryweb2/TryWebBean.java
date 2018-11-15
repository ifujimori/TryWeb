/**
 * @author Copyright (c) 2008,2013, Oracle and/or its affiliates. All rights reserved.
 *  
 */
package jp.trypj.tryweb2;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import java.text.NumberFormat;
import java.util.HashMap;

/**
 * CDI Managed Bean Class
 */
@Named
@RequestScoped
public class TryWebBean {


	private String name = "ABCDE";


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
