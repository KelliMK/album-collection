package org.wecancodeit.albumcollection.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Song {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String time;
	private String recordLabel;
	private String songUrl;
	
	@ManyToOne
	private Album album;
	
//	private Artist artist = album.getArtist();
	
//	private Long artist_id = artist.getId();
//	private Long album_id = album.getId();

	public Song(String title, int min, int sec, String recordLabel, String songUrl, Album album) {
		super();
		this.title = title;
		this.time = min + ";" + sec;
		this.recordLabel = recordLabel;
		this.songUrl = songUrl;
		this.album = album;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getTime() {
		return time;
	}

	public String getRecordLabel() {
		return recordLabel;
	}

	public String getSongUrl() {
		return songUrl;
	}

	public Album getAlbum() {
		return album;
	}

/*	public Artist getArtist() {
		return artist;
	} */

/*	public Long getArtistId() {
		return artist_id;
	} */

	public Long getAlbumId() {
		return album.getId();
	}
	
	
	
}
