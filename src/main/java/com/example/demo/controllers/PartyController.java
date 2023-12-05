package com.example.demo.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.Party;
import com.example.demo.services.PartyService;

@RestController
@RequestMapping("/api")
public class PartyController {

	@Autowired
	PartyService partyService;

	@GetMapping("/parties")
	public List<Party> list() {
		return partyService.list();
	}

	@GetMapping("/party/{id}")
	public Party byId(@PathVariable(name = "id") Integer id) {
		return partyService.byId(id);
	}

	@PostMapping("/party")
	public Party save(@RequestBody Party party) {
		return partyService.save(party);
	}

	@PutMapping("/party/{id}")
	public Party update(@PathVariable(name = "id") Integer id, @RequestBody Party party) {

		Party party_selected = new Party();
		Party party_updated = new Party();

		party_selected = partyService.byId(id);
		party_selected.setId(id);
		party_selected.setContent(party.getContent());
		party_selected.setRegistration_date(party.getRegistration_date());
		party_selected.setUser(party.getUser());

		party_updated = partyService.update(party_selected);

		return party_updated;
	}

	@DeleteMapping("/party/{id}")
	public void delete(@PathVariable Integer id) {
		partyService.delete(id);
	}

}
