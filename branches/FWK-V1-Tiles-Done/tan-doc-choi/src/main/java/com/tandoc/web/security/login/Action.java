package com.tandoc.web.security.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.tandoc.framework.struts.action.AppAction;

public class Action  extends AppAction{
	 public static final String FWD_WELCOME = "fwd/welcome";
	  public ActionForward init(ActionMapping mapping,
              ActionForm form,
              HttpServletRequest request,
              HttpServletResponse response)
              throws Exception{
			Form localForm = (Form) form;
			request.setAttribute("lForm", localForm);		  
		  return super.init(mapping, form, request, response);
	  }
	  
	  public ActionForward excuteLogin(ActionMapping mapping,
              ActionForm form,
              HttpServletRequest request,
              HttpServletResponse response)
              throws Exception
		{		
			Form localForm = (Form) form;
			request.setAttribute("lForm", localForm);	
		return mapping.findForward(FWD_WELCOME);
		}
}
