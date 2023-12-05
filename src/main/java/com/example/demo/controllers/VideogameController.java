package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Videogame;
import com.example.demo.services.VideogameService;

@RestController
@RequestMapping("/api")
public class VideogameController {

	@Autowired
	VideogameService videogameService;

	@GetMapping("/videogames")
	public List<Videogame> list() {
		return videogameService.list();
	}

	@GetMapping("/videogame/{id}")
	public Videogame byId(@PathVariable(name = "id") Integer id) {
		return videogameService.byId(id);
	}

	@PostMapping("/videogame")
	public Videogame save(@RequestBody Videogame videogame) {
		return videogameService.save(videogame);
	}

	@PutMapping("/videogame/{id}")
	public Videogame update(@PathVariable(name = "id") Integer id, @RequestBody Videogame videogame) {

		Videogame videogame_selected = new Videogame();
		Videogame videogame_updated = new Videogame();

		videogame_selected = videogameService.byId(id);
		videogame_selected.setId(id);
		videogame_selected.setName(videogame.getName());

		videogame_updated = videogameService.update(videogame_selected);

		return videogame_updated;
	}

	@DeleteMapping("/videogame/{id}")
	public void delete(@PathVariable Integer id) {
		videogameService.delete(id);
	}

}
