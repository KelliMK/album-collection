package org.wecancodeit.albumcollection.model;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String imageUrl;
	
	@OneToMany(mappedBy="artist")
	private Collection<Album> albums;
	
	public Artist() {}
	
	public Artist(String name, String imageUrl) {
		this.name = name;
		this.imageUrl = imageUrl;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public Collection<Album> getAlbums() {
		return albums;
	}

}
