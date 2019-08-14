package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.Album;

public interface AlbumRepo extends CrudRepository<Album,Integer> {

}
