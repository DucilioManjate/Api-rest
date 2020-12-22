package com.traso.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.traso.model.Usuario;
import com.traso.serviceimpl.UsuarioServiceImpl;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioCrontroller {
	// criar o a implementacao de class
	@Autowired
	private UsuarioServiceImpl usuarioServiceImpl;
	
	//chamar o metodo para salvar um novo usuario
	@PostMapping
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		System.out.println("usuario pronto");
		usuarioServiceImpl.saveUsuario(usuario);
		return usuario;
			
	}
	
	@GetMapping
	public List<Usuario> findAllUsuario(){
		return usuarioServiceImpl.findAllUsuarios();
	}
	@PutMapping("/{id}")
	public Usuario updateUsuario(@RequestBody Usuario usuario, int id) {
		return usuarioServiceImpl.updateUsuario(usuario);
	}
	
	@DeleteMapping("deleteUsuario")
	public String deleteUsuario(@RequestParam int id) {
			return "Usuario deletado!";
	}
	

}
