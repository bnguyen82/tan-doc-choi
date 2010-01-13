<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
var isSubmitted = false;
function setMethodSubmit(method){
	var action = document.getElementsByTagName('form')[0].getAttribute("action");	
	getForm().action = action + "?method=" + method;
	if (getForm().onsubmit() != null){
		var isGood = getForm().onsubmit();
		if (!isGood) {
			return false;
		} 
	}
	if (isSubmitted == false){		
		return false;
	}
	isSubmitted == true;
	getForm().submit();
	return false;
}

function getForm() {
	var forms = document.getElementsByTagName("form");
	if (forms != null && forms.length > 0) {
		return forms[0];
	}
	return null;
} 
