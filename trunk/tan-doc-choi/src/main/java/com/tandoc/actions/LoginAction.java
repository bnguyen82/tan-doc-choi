package com.tandoc.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.tandoc.forms.LoginForm;

public class LoginAction  extends Action{
	  public ActionForward execute(ActionMapping mapping,
              ActionForm form,
              HttpServletRequest request,
              HttpServletResponse response)
              throws Exception
		{		
		LoginForm localForm = (LoginForm) form;
		request.setAttribute("lForm", localForm);
		return mapping.findForward("success");
		}
	  public ActionForward init(ActionMapping mapping,
              ActionForm form,
              HttpServletRequest request,
              HttpServletResponse response)
              throws Exception{
		  
		  return mapping.findForward("/login");
	  }
}
