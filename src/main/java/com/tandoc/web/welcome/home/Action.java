package com.tandoc.web.welcome.home;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.tandoc.framework.struts.action.AppAction;

public class Action extends AppAction {
	public static final String FWD_LOGIN = "fwd/security/login";
	  public ActionForward init(ActionMapping mapping,
              ActionForm form,
              HttpServletRequest request,
              HttpServletResponse response)
              throws Exception{
		  
		  return super.init(mapping, form, request, response);
	  }
	  public ActionForward login(ActionMapping mapping,
              ActionForm form,
              HttpServletRequest request,
              HttpServletResponse response)
              throws Exception{		  
		  return mapping.findForward(FWD_LOGIN);
	  }
}
