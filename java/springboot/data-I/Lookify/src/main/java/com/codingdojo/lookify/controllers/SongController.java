package com.codingdojo.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.services.SongService;

@Controller
public class SongController {
	
	private final SongService songServ;
	
	public SongController(SongService songServ) {
		this.songServ = songServ;
	}
	
	@RequestMapping("/")
	public String index() {
		return "/songs/index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songServ.allSongs();
		model.addAttribute("songs", songs);
		return "/songs/dashboard.jsp";
	}
	
	@RequestMapping("/songs/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Song song = songServ.findSong(id);
		model.addAttribute("song", song);
		return "/songs/song.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "/songs/new.jsp";
	}
	
	@RequestMapping(value="/songs/new", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors()) {
			return "songs/new.jsp";
		} else {
			songServ.createSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/search/{artist}")
	public String search(@PathVariable("artist") String artist, Model model) {
		List<Song> songs = songServ.findArtist(artist);
		model.addAttribute("artist", artist);
		model.addAttribute("songs", songs);
		return "/songs/search.jsp";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(@RequestParam("search_name") String artist) {
		return "redirect:/search/"+artist;
	}
	
	@RequestMapping(value="/songs/{id}", method=RequestMethod.DELETE)
	public String search(@PathVariable("id") Long id) {
		songServ.deleteSong(id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping("/topTen")
	public String topTen(Model model) {
		List<Song> songs = songServ.findTopTen();
		model.addAttribute("songs", songs);
		return "/songs/topTen.jsp";
	}
	
	
}
