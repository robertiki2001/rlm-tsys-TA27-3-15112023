package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Game;
import com.example.demo.services.GameService;

@RestController
@RequestMapping("/api")
public class GameController {

	@Autowired
	GameService gameService;

	@GetMapping("/games")
	public List<Game> list() {
		return gameService.list();
	}

	@GetMapping("/game/{id}")
	public Game byId(@PathVariable(name = "id") Integer id) {
		return gameService.byId(id);
	}

	@PostMapping("/game")
	public Game save(@RequestBody Game game) {
		return gameService.save(game);
	}

	@PutMapping("/game/{id}")
	public Game update(@PathVariable(name = "id") Integer id, @RequestBody Game game) {

		Game game_selected = new Game();
		Game game_updated = new Game();

		game_selected = gameService.byId(id);
		game_selected.setId(id);
		game_selected.setState(game.getState());
		game_selected.setUser(game.getUser());

		game_updated = gameService.update(game_selected);

		return game_updated;
	}

	@DeleteMapping("/game/{id}")
	public void delete(@PathVariable Integer id) {
		gameService.delete(id);
	}

}
