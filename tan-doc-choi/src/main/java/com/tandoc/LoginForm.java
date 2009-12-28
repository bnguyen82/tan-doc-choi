package com.tandoc;

import java.io.Serializable;

import org.apache.struts.validator.ValidatorActionForm;
import org.apache.struts.action.ActionServlet;


public class LoginForm extends ValidatorActionForm implements Serializable{
	private String username;
	 public String getUsername() {
		   return username;
		 }
	 public void setUsername(String username) {
		   this.username = username;
		 }
	
}
