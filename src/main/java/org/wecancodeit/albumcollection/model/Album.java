package org.wecancodeit.albumcollection.model;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Album {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String imageUrl;
	private String recordLabel;
	
	@ManyToOne
	private Artist artist;
	
	@OneToMany(mappedBy="album")
	private Collection<Song> songs;
	
//	private Long artist_id = artist.getId();
	
	public Album() {}
	
	public Album(String name, String imageUrl, String recordLabel, Artist artist) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.recordLabel = recordLabel;
		this.artist = artist;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Artist getArtist() {
		return artist;
	}

	public Collection<Song> getSongs() {
		return songs;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public String getRecordLabel() {
		return recordLabel;
	}

	public Long getArtistId() {
		return artist.getId();
	}
	
	
}
