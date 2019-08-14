package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DAO.AlbumRepo;
import com.example.demo.DAO.PhotoRepo;
import com.example.demo.DAO.StudentRepo;
import com.example.demo.Model.Album;
import com.example.demo.Model.Photo;
import com.example.demo.Model.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo studentRepo;
	@Autowired
	AlbumRepo albumRepo;
	@Autowired
	PhotoRepo photoRepo;
	
	
	
	// /users to fetch all users
	
	@GetMapping("/users")
	public List<Student> allusers()
	{
		return (List<Student>) studentRepo.findAll();
	}
	
	@GetMapping("/albums")
	public List<Album> allAlbums()
	{
		return (List<Album>) albumRepo.findAll();
	}
	
	@GetMapping("/photos")
	public List<Photo> allPhotos()
	{
		return (List<Photo>) photoRepo.findAll();
	}
	
	//JSON Format
	
		@RequestMapping("/albums/{id}")
		@ResponseBody
		public Optional<Album> albumsByID(@PathVariable("id") int album_id)
		{
			return albumRepo.findById(album_id);
		}
		
	//JSON Format
		
			@RequestMapping("/photos/{id}")
			@ResponseBody
			public Optional<Photo> photosById(@PathVariable("id") int photo_id)
			{
				return photoRepo.findById(photo_id);
			}	
		
}
