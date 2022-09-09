package com.mercury.Test.com.mercury.Test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercury.Test.com.mercury.Test.dao.MercuryMusicRepository;
import com.mercury.Test.com.mercury.Test.entity.MercuryMusicEntity;

@Service
public class MercuryMusicService {
	@Autowired
	private MercuryMusicRepository repository;

	public MercuryMusicEntity saveSong(MercuryMusicEntity entity) {
		return repository.saveAndFlush(entity);
	}

	public MercuryMusicEntity getSongById(Integer id) {
		return repository.findById(id).orElse(null);
	}
}
