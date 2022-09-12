package com.pruebas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pruebas.model.Persona;
import com.pruebas.service.PersonaServiceImpl;

/**@author ropold@yahoo.fr
**/
@RestController
@RequestMapping("personas")
public class PersonaController {

	@Autowired
	PersonaServiceImpl personaService;
	

	@PostMapping("/guardar") //http://localhost:8080/personas/guardar
	public void guardar (@RequestBody Persona persona) {
		personaService.save(persona);
	}
	
	@GetMapping("/listar")
	public List<Persona> listar() {
		return personaService.findAll();
		
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		personaService.deleteById(id);
	}
	
	@GetMapping("/obtenerPorId/{id}")
	public void obtenerPorId(@PathVariable("id") Long id) {
		personaService.getById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Persona persona) {
		personaService.save(persona);
	}
	
}
