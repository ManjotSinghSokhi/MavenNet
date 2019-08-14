package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PersistenceUnit;

@Entity
public class Photo {

	@javax.persistence.Id
	
	int photo_id;
	@ManyToOne
	private Student student;
	String photoTitle;
	public int getPhoto_id() {
		return photo_id;
	}
	public void setPhoto_id(int photo_id) {
		this.photo_id = photo_id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getPhotoTitle() {
		return photoTitle;
	}
	public void setPhotoTitle(String photoTitle) {
		this.photoTitle = photoTitle;
	}
	
	
	
	
}
