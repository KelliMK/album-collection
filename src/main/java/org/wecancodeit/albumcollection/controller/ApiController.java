package org.wecancodeit.albumcollection.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.albumcollection.model.Artist;
import org.wecancodeit.albumcollection.model.Album;
import org.wecancodeit.albumcollection.model.Song;
import org.wecancodeit.albumcollection.model.Tag;
import org.wecancodeit.albumcollection.repositories.ArtistRepository;
import org.wecancodeit.albumcollection.repositories.AlbumRepository;
import org.wecancodeit.albumcollection.repositories.SongRepository;
import org.wecancodeit.albumcollection.repositories.TagRepository;

@RestController
public class ApiController {
	
	@Autowired
	ArtistRepository artistRepo;
	
	@Autowired
	AlbumRepository albumRepo;
	
	@Autowired
	SongRepository songRepo;
	
	@Autowired
	TagRepository tagRepo;
	
	@GetMapping("/api/artists")
	public Iterable<Artist> getArtists() {
		return artistRepo.findAll();
	}
	
	@GetMapping("/api/artists/{id}")
	public String getArtist(@PathVariable(value = "id") Long id, Model model) throws Exception {
		Optional<Artist> artist = artistRepo.findById(id);
		if (artist.isPresent()) 
		{
			model.addAttribute("artist", artist.get());
		}
		else
		{
			return "redirect:/index?invalid=true";
		}
		return "index";
	}
	
	@GetMapping("/api/albums")
	public Iterable<Album> getAlbums() {
		return albumRepo.findAll();
	}
	
	@GetMapping("/api/albums/{id}") // Change to old way if final app doesn't map an album to "artists/{artist.id}/albums/{id}"
	public String getAlbum(@PathVariable(value = "id") Long id, Model model) throws Exception {
		Optional<Album> album = albumRepo.findById(id);
		if (album.isPresent()) 
		{
			model.addAttribute("album", album.get());
		}
		else
		{
			return "redirect:/index?invalid=true";
		}
		return "index";
	}
	
	@GetMapping("/api/songs")
	public Iterable<Song> getSongs() {
		return songRepo.findAll();
	}
	
	@GetMapping("/api/songs/{id}")
	public String getSong(@PathVariable(value = "id") Long id, Model model) throws Exception {
		Optional<Song> song = songRepo.findById(id);
		if (song.isPresent())
		{
			model.addAttribute("song", song.get());
		}
		else
		{
			return "redirect:/index?invalid=true";
		}
		return "index";
	}
	
	public Iterable<Tag> getTagName() {
		return tagRepo.findAll();
	}
}
