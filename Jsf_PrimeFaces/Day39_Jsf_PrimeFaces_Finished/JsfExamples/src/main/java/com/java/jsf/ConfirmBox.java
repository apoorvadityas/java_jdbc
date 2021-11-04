package com.java.jsf;

import javax.faces.application.FacesMessage;  
import javax.faces.bean.ManagedBean;  
import javax.faces.context.FacesContext;  

@ManagedBean(name="confirmBox") 
public class ConfirmBox {  
	private String message;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void confirm() {  
		addMessage("Delete record","Record has been deleted.");  
	}  
	public void addMessage(String summary, String detail) {  
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, summary, detail);  
		FacesContext.getCurrentInstance().addMessage(null, message);  
	}  
}