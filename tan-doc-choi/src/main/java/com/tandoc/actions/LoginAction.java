package com.tandoc.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.tandoc.forms.LoginForm;

public class LoginAction  extends DispatchAction{
	  public ActionForward excuteLogin(ActionMapping mapping,
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
			LoginForm localForm = (LoginForm) form;
			request.setAttribute("lForm", localForm);		  
		  return mapping.findForward("success");
	  }
}
