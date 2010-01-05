<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
var nav_isAlreadySubmitted = false;
function nav_setMethodAndSubmit(method) {
	var mainForm = nav_getMainForm();
	if (mainForm == null) {
		return false;
	}

	// Submit form
	if (mainForm.onsubmit != null) {
		var isOk = mainForm.onsubmit();
		if (!isOk) {
			return false;
		}
	}
	
	// Prevent double-click
	if (nav_isAlreadySubmitted) {
		return false;
	}
	nav_isAlreadySubmitted = true;

	//nav_showWaitScreen();
	mainForm.submit();
	return false;
}   

function nav_getMainForm() {
	var forms = document.getElementsByTagName("form");
	if (forms != null && forms.length > 0) {
		return forms[0];
	}
	return null;
} 
