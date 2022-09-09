package com.mercury.Test.com.mercury.Test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.Test.com.mercury.Test.entity.MercuryMusicEntity;
import com.mercury.Test.com.mercury.Test.service.MercuryMusicService;

@RestController
public class MercuryMusicController {
	@Autowired
	private MercuryMusicService musicService;

	@PostMapping("/addSong")
	public MercuryMusicEntity saveSong(@RequestBody MercuryMusicEntity entity) {
		return musicService.saveSong(entity);
	}

	@GetMapping("/getSong/{id}")
	public MercuryMusicEntity getSongById(@PathVariable int id) {
		return musicService.getSongById(id);
	}

}
