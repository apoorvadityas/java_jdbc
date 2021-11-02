package com.java.jsf;

import javax.faces.bean.ManagedBean;  
@ManagedBean(name="inputMask")  
public class InputMask {  
private String date;  
private String phone;  
public String getDate() {  
return date;  
}  
public void setDate(String date) {  
this.date = date;  
}  
public String getPhone() {  
return phone;  
}  
public void setPhone(String phone) {  
this.phone = phone;  
}  
}  
