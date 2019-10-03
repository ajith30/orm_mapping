package com.school;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {
private String name;
@Id
@GeneratedValue
private int rollNo;
private String emailId;
private Long phoneNo;

@OneToMany
private List<Book> listOfBooks;


public List<Book> getListOfBooks() {
	return listOfBooks;
}
public void setListOfBooks(List<Book> listOfBooks) {
	this.listOfBooks = listOfBooks;
}
public Student() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public Long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(Long phoneNo) {
	this.phoneNo = phoneNo;
}

}
