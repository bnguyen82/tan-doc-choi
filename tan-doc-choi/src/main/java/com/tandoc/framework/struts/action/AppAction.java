package com.tandoc.framework.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class AppAction extends DispatchAction {
	  public ActionForward init(ActionMapping mapping,
              ActionForm form,
              HttpServletRequest request,
              HttpServletResponse response)
              throws Exception
		{		
		return mapping.findForward("success");
		}
}
