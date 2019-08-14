package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Album {
	
	@javax.persistence.Id
	int album_id;
	@ManyToOne
	private Student student; //User ID or Student ID
	String albumTitle;
	public int getAlbum_id() {
		return album_id;
	}
	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	
	
	

}
