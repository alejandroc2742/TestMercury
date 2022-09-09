package com.mercury.Test.com.mercury.Test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table( name = "mercury_music")
public class MercuryMusicEntity {
	@Id
	@GeneratedValue
	private int id;
	private String nameSong;
	private String artist;
	private int releaseYear;
}
