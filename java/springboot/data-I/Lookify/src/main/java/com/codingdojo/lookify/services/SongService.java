package com.codingdojo.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.repositories.SongRepository;

@Service
public class SongService {
	private final SongRepository songRepo;
	
	public SongService(SongRepository songRepo) {
		this.songRepo = songRepo;
	}
	
	public List<Song> allSongs() {
		return songRepo.findAll();
	}
	
	public Song findSong(Long id) {
		Optional<Song> s = songRepo.findById(id);
		if(s.isPresent()) return s.get();
		else return null;
	}
	
	public List<Song> findArtist(String search) {
		return songRepo.findByArtistContaining(search);
	}
	
	public Song createSong(Song s) {
		return songRepo.save(s);
	}
	
	public Song updateSong(Song s) {
		return songRepo.save(s);
	}
	
	public void deleteSong(Long id) {
		Optional<Song> s = songRepo.findById(id);
		if(s.isPresent()) songRepo.deleteById(id);
	}
	
	public List<Song> findTopTen() {
		return songRepo.findTop10ByOrderByRatingDesc();
	}
}
