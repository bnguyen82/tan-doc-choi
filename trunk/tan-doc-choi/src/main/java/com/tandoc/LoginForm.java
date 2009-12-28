package com.tandoc;

import java.io.Serializable;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.validator.ValidatorActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionServlet;


public class LoginForm extends ValidatorActionForm implements Serializable{
	private String username;
	 public String getUsername() {
		   return username;
		 }
	 public void setUsername(String username) {
		   this.username = username;
		 }
    public void reset(ActionMapping mapping, ServletRequest request) {
    	super.reset(mapping, request);
    }
}
