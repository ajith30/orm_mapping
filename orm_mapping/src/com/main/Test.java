package com.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.school.Book;
import com.school.Student;

public class Test {
public static void main(String[] args){
		
		
		try {
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session =sessionFactory.openSession();
		session.beginTransaction();

		
	   
	   
	   Book b1=new Book();
	   b1.setBookName("R.S.Agarwal");
	   b1.setSubject("Aptitude");
	   b1.setCategory("English");
	   b1.setEdition("Fifth");
	   
	   
	   Book b2=new Book();
	   b2.setBookName("Lakshmi Kanth");
	   b2.setSubject("Polity");
	   b2.setCategory("Hindi");
	   b2.setEdition("Third");
	   
	   Book b3=new Book();
	   b3.setBookName("Dinesh");
	   b3.setSubject("Design Spring");
	   b3.setCategory("English");
	   b3.setEdition("Fifth");
	   
	   List<Book> books=new ArrayList<Book>();
	   books.add(b1);
	   books.add(b2);
	   books.add(b3);
	   
	   Student s1=new Student();
	   s1.setName("ritika");
	   s1.setPhoneNo(876534222L);
	   s1.setEmailId("ritika@gmail.com");
	   s1.setListOfBooks(books);
	  
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(s1);
		
		session.getTransaction().commit();
		session.close();}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
