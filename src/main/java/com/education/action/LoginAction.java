package com.education.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.education.bean.UserForm;

public class LoginAction extends Action{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		UserForm userform = (UserForm)form;
		String username = userform.getUsername();
		String password = userform.getPassword();
		
		if("admin".equals(username)&&"admin".equals(password)){
			return mapping.findForward("success");
		}else{
			return mapping.findForward("fail");
		}
			
	}

}
