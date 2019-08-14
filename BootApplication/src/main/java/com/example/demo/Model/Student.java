package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Student {

	
	@javax.persistence.Id
	private int Id;
	private String name;
	@OneToMany(mappedBy = "Album")
	private List<Album> album;
	@OneToMany(mappedBy = "Photo")
	private List<Photo> photo;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Album> getAlbum() {
		return album;
	}
	public void setAlbum(List<Album> album) {
		this.album = album;
	}
	public List<Photo> getPhoto() {
		return photo;
	}
	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}
	
	
}
