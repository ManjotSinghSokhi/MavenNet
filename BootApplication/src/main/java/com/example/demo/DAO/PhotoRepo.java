package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Photo;

public interface PhotoRepo extends CrudRepository<Photo, Integer>{

}
