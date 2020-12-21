package com.traso.serviceinterface;

import java.util.List;

import com.traso.model.Usuario;

public interface UsuarioServiceInterface {
	// salvar usuario
	public Usuario saveUsuario (Usuario usuario);
	
	// atualizar usuario
	public Usuario updateUsuario (Usuario usuario);
	
	//buscar todos usuarios no banco de dados
	public List<Usuario> findAllUsuarios ();
	
	//Eliminar ou deletar usuarios
	public void deleteUsuario (int id);
	

}
